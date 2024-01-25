package com.mj.xr.servlet;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

public class BaseServlet extends HttpServlet {
    static {
        DateConverter dateConverter = new DateConverter(null);
        dateConverter.setPatterns(new String[]{"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss"});
        ConvertUtils.register(dateConverter, Date.class);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("UTF-8");

            // 利用方法名调用方法
            String uri = req.getRequestURI();
            String[] composed = uri.split("/");
            String methodName = composed[composed.length - 1];
            Method method = getClass().getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this, req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
