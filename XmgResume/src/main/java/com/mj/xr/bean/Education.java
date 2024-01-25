package com.mj.xr.bean;

import java.util.Date;

public class Education extends BaseBean {
    private String name;
    private String intro;
    private Date beginDay;
    private Date endDay;
    /**
     * 1: 小学
     * 2: 初中
     * 3: 高中
     * 4: 中专
     * 5: 大专
     * 6: 本科
     * 7: 硕士
     * 8: 博士
     * 0: 其他
     * */
    private int type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Date getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(Date beginDay) {
        this.beginDay = beginDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
