package com.rc.service;

import com.rc.dao.RcJobDao;
import com.rc.iservice.IRcJobService;
import com.rc.model.RcJob;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RcJobService implements IRcJobService {

    @Autowired
    private RcJobDao jobDao;

    @Override
    public void addJob(RcJob job) {
        jobDao.insert(job);
    }

    @Override
    public void editJob(RcJob job) {
        jobDao.update(job);
    }

    @Override
    public void deleteJob(Integer jobId) {
        jobDao.delete(jobId);
    }

    @Override
    public RcJob findJobById(Integer jobId) {
        return jobDao.selectBy(jobId);
    }

    @Override
    public List<RcJob> findJobs(Integer num) {
        return jobDao.selectSome(num);
    }

    @Override
    public List<RcJob> findJobs(Integer comId, String jobType, String jobTitle, Integer pageNo, Integer pageSize) {
        return jobDao.selectSome(comId, jobType, jobTitle, pageNo, pageSize);
    }

    @Override
    public int findCount(Integer comId, String jobType, String jobTitle) {
        return jobDao.selectCount(comId, jobType, jobTitle);
    }
}
