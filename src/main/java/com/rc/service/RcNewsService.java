package com.rc.service;

import com.rc.dao.RcNewsDao;
import com.rc.iservice.IRcNewsService;
import com.rc.model.RcNews;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RcNewsService implements IRcNewsService {

    @Autowired
    private RcNewsDao newsDao;

    @Override
    public void addNews(RcNews news) {
        newsDao.insert(news);
    }

    @Override
    public void editNews(RcNews news) {
        newsDao.update(news);
    }

    @Override
    public void deleteNews(Integer newsId) {
        newsDao.delete(newsId);
    }

    @Override
    public RcNews findNewById(Integer newsId) {
        return newsDao.selectBy(newsId);
    }

    @Override
    public List<RcNews> findNewses(Integer pageNo, Integer pageSize) {
        return newsDao.selectAll(pageNo, pageSize);
    }

    @Override
    public int findCount() {
        return newsDao.selectAllCount();
    }
}
