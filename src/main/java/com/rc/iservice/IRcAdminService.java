package com.rc.iservice;

import com.rc.model.RcAdmin;

public interface IRcAdminService {
    void editAdmin(RcAdmin admin);

    RcAdmin findAdmin(String userName, String userPwd);
}
