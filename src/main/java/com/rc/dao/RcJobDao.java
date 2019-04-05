package com.rc.dao;

import com.rc.idao.IRcJobDao;
import com.rc.model.RcJob;

import java.util.List;

public class RcJobDao extends RcBaseDao<RcJob, Integer> implements IRcJobDao {
    public RcJobDao() {
        super(RcJob.class);
    }

    @Override
    public List<RcJob> selectSome(Integer num) {
        return super.selectTopSome("select o from RcJob o order by o.jobPostTime desc", num);
    }

    @Override
    public List<RcJob> selectSome(Integer comId, String jobType, String jobTitle, Integer pageNo, Integer pageSize) {
        return super.selectSomeByPage("select o from RcJob o where " + (comId != null ? ("o.company.userid=" + comId + " and ") : "")
                + "o.jobType like ? and o.jobTitle like ?", pageNo, pageSize, "%" + jobType + "%", "%" + jobTitle + "%");
    }

    @Override
    public int selectCount(Integer comId, String jobType, String jobTitle) {
        return super.selectCount("select count(o) from RcJob o where " + (comId != null ? ("o.company.userid=" + comId + " and ") : "")
                + "o.jobType like ? and o.jobTitle like ?", "%" + jobType + "%", "%" + jobTitle + "%");
    }
}
