package com.mj.xr.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/education/*")
public class EducationServlet extends BaseServlet {
    public void admin(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("education admin");
    }
}
