package com.rc.common;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public class RcHibernateHelper extends HibernateDaoSupport {
    public void insert(Object obj) {
        assert this.getHibernateTemplate() != null;
        this.getHibernateTemplate().save(obj);
    }

    public Object selectById(Class cls, Serializable id) {
        assert this.getHibernateTemplate() != null;
        return this.getHibernateTemplate().get(cls, id);
    }

    public void delete(Class cls, Serializable id) {
        assert this.getHibernateTemplate() != null;
        this.getHibernateTemplate().delete(selectById(cls, id));
    }

    public List selectAll(Class cls) {
        return selectSome("select o from " + cls.getSimpleName() + " o");
    }

    public List selectAll(Class cls, Integer pageNo, Integer pageSize) {
        return selectSomeByPage("select o from " + cls.getSimpleName() + " o", pageNo, pageSize);
    }

    public int selectAllCount(Class cls) {
        return selectCount("select count(o) from " + cls.getSimpleName() + " o");
    }

    public void update(Object obj) {
        assert this.getHibernateTemplate() != null;
        this.getHibernateTemplate().update(obj);
    }

    public Object selectOne(final String hql, final Object... values) {
        Object obj = this.getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException {
                Query query = session.createQuery(hql);
                for (int i = 0; i < values.length; i++) {
                    query.setParameter(i, values[i]);
                }
                query.setMaxResults(1);
                return query.uniqueResult();
            }

        });

        return obj;
    }

    public List selectSome(final String hql, final Object... values) {
        List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery(hql);
                for (int i = 0; i < values.length; i++) {
                    query.setParameter(i, values[i]);
                }
                return query.list();
            }
        });
        return list;
    }

    public int selectCount(final String hql, final Object... values) {
        Object obj = this.getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery(hql);
                for (int i = 0; i < values.length; i++) {
                    query.setParameter(i, values[i]);
                }
                return query.uniqueResult();
            }
        });
        return ((Long) obj).intValue();
    }

    public List selectTopSome(final String hql, final Integer num, final Object... values) {
        List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery(hql);
                for (int i = 0; i < values.length; i++) {
                    query.setParameter(i, values[i]);
                }
                query.setFirstResult(0);
                query.setMaxResults(num);
                return query.list();
            }
        });
        return list;
    }

    public List selectSomeByPage(final String hql, final Integer pageNo, final Integer pageSize, final Object... values) {
        List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery(hql);
                for (int i = 0; i < values.length; i++) {
                    query.setParameter(i, values[i]);
                }
                query.setFirstResult((pageNo - 1) * pageSize);
                query.setMaxResults(pageSize);
                return query.list();
            }
        });
        return list;
    }

}
