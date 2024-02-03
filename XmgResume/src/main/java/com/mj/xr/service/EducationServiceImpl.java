package com.mj.xr.service;

import com.mj.xr.bean.Education;
import com.mj.xr.dao.EducationDaoImpl;

import java.util.List;

public class EducationServiceImpl implements EducationService {
    private final EducationDaoImpl dao = new EducationDaoImpl();
    /**
     * 删除多个对象
     * */
    public boolean remove(List<Integer> ids) {
        return dao.remove(ids);
    }

    /**
     * 保存或修改
     * */
    public boolean save(Education education) {
        return dao.save(education);
    }

    /**
     * 获取单个对象
     * */
    public Education get(Integer id) {
        return dao.get(id);
    }

    /**
     * 获取多个对象
     * */
    public List<Education> list() {
        return dao.list();
    }

    /**
     * 获取统计值
     * */
    public int count() {
        return 0;
    }
}
