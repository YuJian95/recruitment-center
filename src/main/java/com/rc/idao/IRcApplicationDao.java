package com.rc.idao;

import com.rc.model.RcApplication;

import java.util.List;

public interface IRcApplicationDao extends IRcBaseDao<RcApplication,Integer> {
    List<RcApplication> selectSome(Integer comId, Integer perId, Integer pageNo, Integer pageSize);

    int selectCount(Integer comId, Integer perId);
}
