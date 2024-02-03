package com.mj.xr.service;

import com.mj.xr.bean.Education;

import java.util.List;

public interface EducationService {
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
