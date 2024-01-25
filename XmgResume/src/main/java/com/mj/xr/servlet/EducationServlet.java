package com.mj.xr.servlet;

import com.mj.xr.dao.EducationDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/education/*")
public class EducationServlet extends BaseServlet {
    private final EducationDao dao = new EducationDao();
    public void admin(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setAttribute("educations", dao.list());
        request.getRequestDispatcher("/page/admin/education.jsp").forward(request, response);
    }
}
