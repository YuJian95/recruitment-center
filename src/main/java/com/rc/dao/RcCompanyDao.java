package com.rc.dao;

import com.rc.idao.IRcCompanyDao;
import com.rc.model.RcCompany;

import java.util.List;

public class RcCompanyDao extends RcBaseDao<RcCompany, Integer> implements IRcCompanyDao {
    public RcCompanyDao() {
        super(RcCompany.class);
    }

    @Override
    public RcCompany selectOne(String userName, String userPwd) {
        return super.selectOne("select o from RcCompany o where o.userName=? and o.userPwd=?", userName, userPwd);
    }

    @Override
    public List<RcCompany> selectSome(Integer num) {
        return super.selectTopSome("select o from RcCompany o order by o.comPostTime desc", num);
    }

    @Override
    public List<RcCompany> selectSome(String comType, String comName, Integer pageNo, Integer pageSize) {
        return super.selectSomeByPage("select o from RcCompany o where o.comType like? and o.comName like ?", pageNo, pageSize);
    }

    @Override
    public int selectCount(String comType, String comName) {
        return super.selectCount("select count(o) from RcCompany o where o.comType like ? and o.comName like ?", "%" + comType + "%", "%" + comName + "%");
    }
}
