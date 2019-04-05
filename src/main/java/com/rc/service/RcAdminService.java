package com.rc.service;

import com.rc.dao.RcAdminDao;
import com.rc.iservice.IRcAdminService;
import com.rc.model.RcAdmin;
import org.springframework.beans.factory.annotation.Autowired;

public class RcAdminService implements IRcAdminService {

    @Autowired
    private RcAdminDao adminDao;

    @Override
    public void editAdmin(RcAdmin admin) {
        adminDao.update(admin);
    }

    @Override
    public RcAdmin findAdmin(String userName, String userPwd) {
        return adminDao.selectOne(userName, userPwd);
    }
}
