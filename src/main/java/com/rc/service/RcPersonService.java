package com.rc.service;

import com.rc.idao.IRcPersonDao;
import com.rc.iservice.IRcPersonService;
import com.rc.model.RcPerson;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RcPersonService implements IRcPersonService {

    @Autowired
    private IRcPersonDao personDao;

    @Override
    public void addPerson(RcPerson person) {
        personDao.insert(person);
    }

    @Override
    public void editPerson(RcPerson person) {
        personDao.update(person);
    }

    @Override
    public void deletePerson(Integer userId) {
        personDao.delete(userId);
    }

    @Override
    public RcPerson findPersonById(Integer userId) {
        return personDao.selectBy(userId);
    }

    @Override
    public RcPerson findPerson(String userName, String userPwd) {
        return personDao.selectOne(userName, userPwd);
    }

    @Override
    public List<RcPerson> findPersons(Integer num) {
        return personDao.selectSome(num);
    }

    @Override
    public List<RcPerson> findPersons(String perJobTarget, Integer pageNo, Integer pageSize) {
        return personDao.selectSome(perJobTarget, pageNo, pageSize);
    }

    @Override
    public int findCount(String perJobTarget) {
        return personDao.selectCount(perJobTarget);
    }
}
