package com.rc.idao;

import com.rc.model.RcAdmin;

public interface IRcAdminDao extends IRcBaseDao<RcAdmin,Integer> {
    RcAdmin selectOne(String userName, String userPwd);
}
