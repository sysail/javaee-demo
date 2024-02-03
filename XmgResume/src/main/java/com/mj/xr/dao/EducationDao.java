package com.mj.xr.dao;

import com.mj.xr.bean.Education;
import com.mj.xr.util.Dbs;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.ArrayList;
import java.util.List;

public interface EducationDao {
    /**
     * 删除多个对象
     * */
    boolean remove(List<Integer> ids);

    /**
     * 保存或修改
     * */
    boolean save(Education education);

    /**
     * 获取单个对象
     * */
    Education get(Integer id);

    /**
     * 获取多个对象
     * */
    List<Education> list();

    /**
     * 获取统计值
     * */
    int count();
}
