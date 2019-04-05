package com.rc.iservice;

import com.rc.model.RcJob;

import java.util.List;

public interface IRcJobService {
    void addJob(RcJob job);

    void editJob(RcJob job);

    void deleteJob(Integer jobId);

    RcJob findJobById(Integer jobId);

    List<RcJob> findJobs(Integer num);

    List<RcJob> findJobs(Integer comId, String jobType, String jobTitle, Integer pageNo, Integer pageSize);

    int findCount(Integer comId, String jobType, String jobTitle);
}
