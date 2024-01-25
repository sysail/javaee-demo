package com.mj.xr.servlet;

import com.mj.xr.bean.Education;
import com.mj.xr.dao.EducationDao;
import org.apache.commons.beanutils.BeanUtils;

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

    public void save(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Education education = new Education();
        BeanUtils.populate(education, request.getParameterMap());
        if (dao.save(education)) {
            // 重定向到原来的页面（刷新）
            response.sendRedirect(request.getContextPath() + "/education/admin");
        } else {
            request.setAttribute("error", "教育信息保存失败");
            request.getRequestDispatcher("/page/error.jsp").forward(request, response);
        }
    }

    public void remove(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Integer id = Integer.valueOf(request.getParameter("id"));
        if (dao.remove(id)) {
            response.sendRedirect(request.getContextPath() + "/education/admin");
        } else {
            request.setAttribute("error", "教育信息删除失败");
            request.getRequestDispatcher("/page/error.jsp").forward(request, response);
        }
    }
}
