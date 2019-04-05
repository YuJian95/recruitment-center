package com.rc.dao;

import com.rc.idao.IRcAdminDao;
import com.rc.model.RcAdmin;

public class RcAdminDao extends RcBaseDao<RcAdmin, Integer> implements IRcAdminDao {

    public RcAdminDao() {
        super(RcAdmin.class);
    }

    @Override
    public RcAdmin selectOne(String userName, String userPwd) {
        return super.selectOne("select o from RcAdmin o where o.userName=? and o.userPwd=?", userName, userPwd);
    }


}
