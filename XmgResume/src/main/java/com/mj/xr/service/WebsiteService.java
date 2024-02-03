package com.mj.xr.service;

import com.mj.xr.bean.Website;

import java.util.List;

public interface WebsiteService {
    /**
     * 删除单个对象
     * */
    boolean remove(Integer id);

    /**
     * 保存或修改
     * */
    boolean save(Website website);

    /**
     * 获取单个对象
     * */
    Website get(Integer id);

    /**
     * 获取多个对象
     * */
    List<Website> list();

    /**
     * 获取统计值
     * */
    int count();
}
