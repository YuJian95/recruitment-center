package com.rc.service;

import com.rc.dao.RcApplicationDao;
import com.rc.iservice.IRcApplicationService;
import com.rc.model.RcApplication;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RcApplicationService implements IRcApplicationService {

    @Autowired
    private RcApplicationDao applicationDao;

    @Override
    public void addApplication(RcApplication app) {
        applicationDao.insert(app);
    }

    @Override
    public void editApplication(RcApplication app) {
        applicationDao.update(app);
    }

    @Override
    public void deleteApplication(Integer appId) {
        applicationDao.delete(appId);
    }

    @Override
    public RcApplication findApplicationById(Integer appId) {
        return applicationDao.selectBy(appId);
    }

    @Override
    public List<RcApplication> findApplications(Integer comId, Integer perId, Integer pageNo, Integer pageSize) {
        return applicationDao.selectSome(comId, perId, pageNo, pageSize);
    }

    @Override
    public int findCount(Integer comId, Integer perId) {
        return applicationDao.selectCount(comId, perId);
    }
}
