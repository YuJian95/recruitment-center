package com.rc.idao;

import java.io.Serializable;
import java.util.List;

public interface IRcBaseDao<T, ID extends Serializable> {
    void insert(T obj);

    void update(T obj);

    void delete(ID id);

    T selectBy(ID id);

    List<T> selectAll();

    List<T> selectAll(Integer pageNo, Integer pageSize);

    int selectAllCount();
}
