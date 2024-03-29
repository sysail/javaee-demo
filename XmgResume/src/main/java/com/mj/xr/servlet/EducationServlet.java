package com.mj.xr.servlet;

import com.mj.xr.bean.Education;
import com.mj.xr.service.EducationService;
import com.mj.xr.service.EducationServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/education/*")
public class EducationServlet extends BaseServlet {
    private final EducationService service = new EducationServiceImpl();

    public void admin(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setAttribute("educations", service.list());
        request.getRequestDispatcher("/WEB-INF/page/admin/education.jsp").forward(request, response);
    }

    public void save(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Education education = new Education();
        BeanUtils.populate(education, request.getParameterMap());
        if (service.save(education)) {
            // 重定向到原来的页面（刷新）
            response.sendRedirect(request.getContextPath() + "/education/admin");
        } else {
            request.setAttribute("error", "教育信息保存失败");
            request.getRequestDispatcher("/WEB-INF/page/error.jsp").forward(request, response);
        }
    }

    /**
    public void remove(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Integer id = Integer.valueOf(request.getParameter("id"));
        if (dao.remove(id)) {
            response.sendRedirect(request.getContextPath() + "/education/admin");
        } else {
            request.setAttribute("error", "教育信息删除失败");
            request.getRequestDispatcher("/page/error.jsp").forward(request, response);
        }
    }
     */

    public void remove(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String[] idStrs = request.getParameterValues("id");
        List<Integer> ids = new ArrayList<>();
        for (String idStr : idStrs) {
            ids.add(Integer.valueOf(idStr));
        }
        if (service.remove(ids)) {
            response.sendRedirect(request.getContextPath() + "/education/admin");
        } else {
            request.setAttribute("error", "教育信息删除失败");
            request.getRequestDispatcher("/WEB-INF/page/error.jsp").forward(request, response);
        }
    }
}
