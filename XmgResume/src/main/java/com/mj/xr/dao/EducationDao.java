package com.mj.xr.dao;

import com.mj.xr.bean.Education;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.ArrayList;
import java.util.List;

public class EducationDao extends BaseDao {

    /**
     * 删除单个对象
     * */
    public boolean remove(Integer id) {
        String sql = "DELETE FROM education WHERE id = ?";
        return tpl.update(sql, id) > 0;
    }

    /**
     * 保存或修改
     * */
    public boolean save(Education education) {
        Integer id = education.getId();
        List<Object> args = new ArrayList<>();
        args.add(education.getName());
        args.add(education.getType());
        args.add(education.getIntro());
        args.add(education.getBeginDay());
        args.add(education.getEndDay());
        String sql;
        if (id == null || id < 1) {
            sql = "INSERT INTO education(name, type, intro, begin_day, end_day) VALUES(?, ?, ?, ?, ?)";
        } else {
            sql = "UPDATE education SET name = ?, type = ?, intro = ?, begin_day = ?, end_day = ? WHERE id = ?";
            args.add(id);
        }
        return tpl.update(sql, args.toArray()) > 0;
    }

    /**
     * 获取单个对象
     * */
    public Education get(Integer id) {
        String sql = "SELECT id, created_time, name, type, intro, begin_day, end_day FROM education WHERE id = ?";
        return tpl.queryForObject(sql, new BeanPropertyRowMapper<>(Education.class), id);
    }

    /**
     * 获取多个对象
     * */
    public List<Education> list() {
        String sql = "SELECT id, created_time, name, type, intro, begin_day, end_day FROM education";
        return tpl.query(sql, new BeanPropertyRowMapper<>(Education.class));
    }

    /**
     * 获取统计值
     * */
    public int count() {
        return 0;
    }
}
