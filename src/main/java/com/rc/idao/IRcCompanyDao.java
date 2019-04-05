package com.rc.idao;

import com.rc.model.RcCompany;

import java.util.List;

public interface IRcCompanyDao extends IRcBaseDao<RcCompany,Integer> {
    RcCompany selectOne(String userName, String userPwd);

    List<RcCompany> selectSome(Integer num);

    List<RcCompany> selectSome(String comType, String comName, Integer pageNo, Integer pageSize);

    int selectCount(String comType, String comName);
}
