package com.mj.xr.servlet;

import com.mj.xr.bean.Skill;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Reader;
import java.util.List;

@WebServlet("/skill/*")
public class SkillServlet extends BaseServlet {
    public void admin(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try (Reader reader = Resources.getResourceAsReader("mybatis-config.xml")) {
            // 创建一个工厂构建器
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            // 创建一个工厂
            SqlSessionFactory factory = builder.build(reader);
            // 创建一个session
            SqlSession session = factory.openSession();
            // 执行SQL语句
            List<Skill> skills = session.selectList("skill.list");
            for (Skill skill: skills) {
                System.out.println(skill);
            }
            // 关闭session
            session.close();
        }
    }
}
