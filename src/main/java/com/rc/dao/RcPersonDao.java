package com.rc.dao;

import com.rc.idao.IRcPersonDao;
import com.rc.model.RcPerson;

import java.util.List;

public class RcPersonDao extends RcBaseDao<RcPerson, Integer> implements IRcPersonDao {
    public RcPersonDao() {
        super(RcPerson.class);
    }

    @Override
    public RcPerson selectOne(String userName, String userPwd) {
        return super.selectOne("select o from RcPerson o where o.userName=? and o.userPwd=?", userName, userPwd);
    }

    @Override
    public List<RcPerson> selectSome(Integer num) {
        return super.selectTopSome("select o from RcPerson o order by o.perPostTime desc", num);
    }

    @Override
    public List<RcPerson> selectSome(String perJobTarget, Integer pagNo, Integer pageSize) {
        return super.selectSomeByPage("select o from RcPerson o where o.perJobTarget like ?", pagNo, pageSize);
    }

    @Override
    public int selectCount(String perJobTarget) {
        return super.selectCount("select count(o) from RcPerson o where o.perJobTarget like ?", "%" + perJobTarget + "%");
    }
}
