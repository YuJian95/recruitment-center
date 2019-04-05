package com.rc.iservice;

import com.rc.model.RcPerson;

import java.util.List;

public interface IRcPersonService {
    void addPerson(RcPerson person);

    void editPerson(RcPerson person);

    void deletePerson(Integer userId);

    RcPerson findPersonById(Integer userId);

    RcPerson findPerson(String userName, String userPwd);

    List<RcPerson> findPersons(Integer num);

    List<RcPerson> findPersons(String perJobTarget, Integer pageNo, Integer pageSize);

    int findCount(String perJobTarget);
}
