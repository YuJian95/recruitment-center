package com.rc.iservice;

import com.rc.model.RcCompany;

import java.util.List;

public interface IRcCompanyService {
    void addCompany(RcCompany com);

    void editCompany(RcCompany com);

    void deleteCompany(Integer comId);

    RcCompany findCompanyById(Integer userId);

    RcCompany findCompany(String userName, String userPwd);

    List<RcCompany> findCompanies(Integer num);

    List<RcCompany> findCompanies(String comType, String comName, Integer pageNo, Integer pageSize);

    int findCount(String comType, String comName);
}
