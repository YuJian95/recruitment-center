package com.rc.common;

import java.util.List;

public class RcPageList<T> {
    private String pageBar;
    private String numPageBar;

    private List<T> list;

    public RcPageList(List<T> list, int count, int pageSize, int pageNo, String url) {
        if (count == 0) {
            pageBar = "";
            numPageBar = "";
            return;
        }

        int pageCount = count / pageSize + (count % pageSize == 0 ? 0 : 1);

        if (pageNo < 1) {
            pageNo = 1;
        }

        if (pageNo > pageCount) {
            pageNo = pageCount;
        }

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("每页:").append(pageSize).append("&nbsp;页次:").append(pageNo).append("/").append(pageCount).append("&nbsp;总计:").append(count).append("&nbsp;");
        if (pageNo == 1) {
            stringBuffer.append("首页&nbsp;上页&nbsp;");
        } else {
            stringBuffer.append("<a href=\"").append(url).append("?pageNo=").append("1\">首页</a>&nbsp;");
        }

        if (pageNo == pageCount) {
            stringBuffer.append("下页&nbsp;尾页");
        } else {
            stringBuffer.append("<a href=\"").append(url).append("?pageNo=").append(pageNo + 1).append("\">下页</a>&nbsp;");
            stringBuffer.append("<a href=\"").append(url).append("?pageNo=").append(pageCount).append("\">尾页</a>");
        }

        pageBar = stringBuffer.toString();
        stringBuffer = new StringBuffer();

        int group = pageNo / 10 + (pageNo % 10 == 0 ? 0 : 1);
        int start = (group - 1) * 10 + 1;
        int end = start + 9;

        if (end > pageCount) {
            end = pageCount;
        }
        if (start > 1) {
            stringBuffer.append("&nbsp;<a href=\"JavaScript:").append(url).append("?pageNo=").append(start - 1).append("\">&lt;</a>");
        }

        for (int i = start; i < end; i++) {
            if (pageNo != i) {
                stringBuffer.append("[<a href=\"").append(url).append("?pageNo=").append(i).append("\">").append(i).append("</a>]");
            } else {
                stringBuffer.append("[").append(i).append("]");
            }
        }

        if (end < pageCount) {
            stringBuffer.append("<a href=\"").append(url).append("?pageNo=").append(end + 1).append("\">&gt;</a>&nbsp;");
        }

        numPageBar = stringBuffer.toString();
        this.list = list;
    }

    public String getPageBar() {
        return pageBar;
    }

    public String getNumPageBar() {
        return numPageBar;
    }

    public List<T> getList() {
        return list;
    }
}
