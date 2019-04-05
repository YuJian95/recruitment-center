package com.rc.dao;

import com.rc.common.RcHibernateHelper;
import com.rc.idao.IRcBaseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RcBaseDao<T, ID extends java.io.Serializable> implements IRcBaseDao<T, ID> {
    @Autowired
    private RcHibernateHelper helper;
    private Class<T> cls;

    public RcBaseDao(Class<T> cls) {
        this.cls = cls;
    }

    @Override
    public void insert(T obj) {
        helper.insert(obj);
    }

    @Override
    public void update(T obj) {
        helper.update(obj);
    }

    @Override
    public void delete(ID id) {
        helper.delete(cls, id);
    }

    @Override
    public T selectBy(ID id) {
        return (T) helper.selectById(cls, id);
    }

    @Override
    public List<T> selectAll() {
        return (List<T>) helper.selectAll(cls);
    }

    @Override
    public List<T> selectAll(Integer pageNo, Integer pageSize) {
        return (List<T>) helper.selectAll(cls, pageNo, pageSize);
    }

    @Override
    public int selectAllCount() {
        return helper.selectAllCount(cls);
    }

    protected T selectOne(String hql, Object... values) {
        return (T) helper.selectOne(hql, values);
    }

    protected List<T> selectSomeByPage(String hql, Integer pageNo, Integer pageSize, Object... values) {
        return (List<T>) helper.selectSomeByPage(hql, pageNo, pageSize, values);
    }

    protected List<T> selectTopSome(String hql, Integer num, Object... values) {
        return (List<T>) helper.selectTopSome(hql, num, values);
    }

    protected T selectSome(String hql, Object... values) {
        return (T) helper.selectSome(hql, values);
    }

    protected int selectCount(String hql, Object... values) {
        return helper.selectCount(hql, values);
    }
}
