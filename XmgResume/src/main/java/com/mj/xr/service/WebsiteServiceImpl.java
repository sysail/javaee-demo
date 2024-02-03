package com.mj.xr.service;

import com.mj.xr.bean.Website;
import com.mj.xr.dao.WebsiteDaoImpl;

import java.util.List;

public class WebsiteServiceImpl implements WebsiteService {
    private final WebsiteDaoImpl dao = new WebsiteDaoImpl();
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
        return dao.save(website);
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
        return dao.list();
    }

    /**
     * 获取统计值
     * */
    public int count() {
        return 0;
    }
}
