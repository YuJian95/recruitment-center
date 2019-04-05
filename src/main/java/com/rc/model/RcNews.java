package com.rc.model;

import java.util.Date;

public class RcNews implements java.io.Serializable {
    private Integer newsId;
    private String newsTitle;
    private String newsContent;
    private Date newsPostTime;

    public RcNews() {
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public Date getNewsPostTime() {
        return newsPostTime;
    }

    public void setNewsPostTime(Date newsPostTime) {
        this.newsPostTime = newsPostTime;
    }
}
