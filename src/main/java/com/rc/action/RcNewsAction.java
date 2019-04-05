package com.rc.action;

import com.rc.common.RcPageList;
import com.rc.iservice.IRcNewsService;
import com.rc.model.RcNews;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RcNewsAction {
    private final int PAGE_SIZE = 8;
    @Autowired
    private IRcNewsService newsService;
    private RcNews news;
    private Integer newsId;
    private RcPageList<RcNews> plist;
    private Integer pageNo;

    private void find(String url) throws Exception {
        if (pageNo == null) {
            pageNo = 1;
        }
        List<RcNews> list = newsService.findNewses(pageNo, PAGE_SIZE);
        int count = newsService.findCount();
        plist = new RcPageList<>(list, count, PAGE_SIZE, pageNo, url);
    }

    public String manage() throws Exception {
        find("/rc/RcNewsAction!manage.action");
        return "manage";
    }

    public String browse() throws Exception {
        find("/rc/RcNewsAction!browse.action");
        return "browse";
    }

    public String add() throws Exception {
        newsService.addNews(news);
        return "manageaction";
    }

    public String willedit() throws Exception {
        news = newsService.findNewById(newsId);
        return "willedit";
    }

    public String edit() throws Exception {
        newsService.editNews(news);
        return "manageaction";
    }

    public String delete() throws Exception {
        newsService.deleteNews(newsId);
        return "manageaction";
    }

    public String show() throws Exception {
        news = newsService.findNewById(newsId);
        return "show";
    }
}
