package com.mj.xr.dao;

import com.mj.xr.bean.Website;
import com.mj.xr.util.Dbs;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.ArrayList;
import java.util.List;

public class WebsiteDaoImpl implements WebsiteDao {

    /**
     * 删除单个对象
     * */
    public boolean remove(Integer id) {
        return false;
    }

    /**
     * 保存或修改
     * */
    public boolean save(Website website) {
        Integer id = website.getId();
        List<Object> args = new ArrayList<>();
        args.add(website.getFooter());
        String sql;
        if (id == null || id < 1) {
            sql = "INSERT INTO website(footer) VALUES(?)";
        } else {
            sql = "UPDATE website SET footer = ? WHERE id = ?";
            args.add(id);
        }
        return Dbs.getTpl().update(sql, args.toArray()) > 0;
    }

    /**
     * 获取单个对象
     * */
    public Website get(Integer id) {
        return null;
    }

    /**
     * 获取多个对象
     * */
    public List<Website> list() {
        String sql = "SELECT id, created_time, footer FROM website";
        return Dbs.getTpl().query(sql, new BeanPropertyRowMapper<>(Website.class));
    }

    /**
     * 获取统计值
     * */
    public int count() {
        return 0;
    }
}
