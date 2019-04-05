package com.rc.dao;

import com.rc.idao.IRcApplicationDao;
import com.rc.model.RcApplication;

import java.util.List;

public class RcApplicationDao extends RcBaseDao<RcApplication, Integer> implements IRcApplicationDao {
    public RcApplicationDao() {
        super(RcApplication.class);
    }

    @Override
    public List<RcApplication> selectSome(Integer comId, Integer perId, Integer pageNo, Integer pageSize) {

        return super.selectSomeByPage("select o from RcApplication o where " + getStr(comId, perId), pageNo, pageSize);
    }

    @Override
    public int selectCount(Integer comId, Integer perId) {

        return super.selectCount("select count(o) from RcApplication o where " + getStr(comId, perId));
    }

    private String getStr(Integer comId, Integer perId) {
        String str = "";
        if (comId != null) {
            str = "o.job.company.userId=" + comId;
        }

        if (perId != null) {
            str = (str.equals("") ? "" : " and ") + "o.person.userId=" + perId;
        }
        return str;
    }
}
