package com.rc.service;

import com.rc.dao.RcCompanyDao;
import com.rc.iservice.IRcCompanyService;
import com.rc.model.RcCompany;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RcCompanyService implements IRcCompanyService {

    @Autowired
    private RcCompanyDao companyDao;

    @Override
    public void addCompany(RcCompany com) {
        companyDao.insert(com);
    }

    @Override
    public void editCompany(RcCompany com) {
        companyDao.update(com);
    }

    @Override
    public void deleteCompany(Integer comId) {
        companyDao.delete(comId);
    }

    @Override
    public RcCompany findCompanyById(Integer userId) {
        return companyDao.selectBy(userId);
    }

    @Override
    public RcCompany findCompany(String userName, String userPwd) {
        return companyDao.selectOne(userName, userPwd);
    }

    @Override
    public List<RcCompany> findCompanies(Integer num) {
        return companyDao.selectSome(num);
    }

    @Override
    public List<RcCompany> findCompanies(String comType, String comName, Integer pageNo, Integer pageSize) {
        return companyDao.selectSome(comType, comName, pageNo, pageSize);
    }

    @Override
    public int findCount(String comType, String comName) {
        return companyDao.selectCount(comType, comName);
    }
}
