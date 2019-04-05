package com.rc.iservice;

import com.rc.model.RcNews;

import java.util.List;

public interface IRcNewsService {
    void addNews(RcNews news);

    void editNews(RcNews news);

    void deleteNews(Integer newsId);

    RcNews findNewById(Integer newsId);

    List<RcNews> findNewses(Integer pageNo, Integer pageSize);

    int findCount();
}
