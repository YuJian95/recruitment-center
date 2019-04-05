package com.rc.dao;

import com.rc.idao.IRcNewsDao;
import com.rc.model.RcNews;

public class RcNewsDao extends RcBaseDao<RcNews, Integer> implements IRcNewsDao {
    public RcNewsDao() {
        super(RcNews.class);
    }
}
