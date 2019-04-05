package com.rc.idao;

import com.rc.model.RcJob;

import java.util.List;

public interface IRcJobDao extends IRcBaseDao<RcJob, Integer> {
    List<RcJob> selectSome(Integer num);

    List<RcJob> selectSome(Integer comId, String jobType, String jobTitle, Integer pageNo, Integer pageSize);

    int selectCount(Integer comId, String jobType, String jobTitle);
}
