package com.mj.xr.dao;

import java.util.List;

public class BaseDaoImpl<T> implements BaseDao<T> {
    @Override
    public boolean remove(Integer id) {
        return false;
    }

    @Override
    public boolean remove(List<Integer> ids) {
        return false;
    }

    @Override
    public boolean save(T bean) {
        return false;
    }

    @Override
    public T get(Integer id) {
        return null;
    }

    @Override
    public List<T> list() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
