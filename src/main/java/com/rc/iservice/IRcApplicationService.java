package com.rc.iservice;

import com.rc.model.RcApplication;

import java.util.List;

public interface IRcApplicationService {
    void addApplication(RcApplication app);

    void editApplication(RcApplication app);

    void deleteApplication(Integer appId);

    RcApplication findApplicationById(Integer appId);

    List<RcApplication> findApplications(Integer comId, Integer perId, Integer pageNo, Integer pageSize);

    int findCount(Integer comId, Integer perId);
}
