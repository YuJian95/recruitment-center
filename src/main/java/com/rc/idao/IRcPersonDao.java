package com.rc.idao;

import com.rc.model.RcPerson;

import java.util.List;

public interface IRcPersonDao extends IRcBaseDao<RcPerson, Integer> {
    RcPerson selectOne(String userName, String userPwd);

    List<RcPerson> selectSome(Integer num);

    List<RcPerson> selectSome(String perJobTarget, Integer pageNo, Integer pageSize);

    int selectCount(String perJobTarget);
}
