package com.mj.xr.bean;

import java.util.Date;

public class Education extends BaseBean {
    private String name;
    private String intro;
    private Date beginDay;
    private Date endDay;
    /**
     * 0: 小学
     * 1: 初中
     * 2: 高中
     * 3: 本科
     * 4: 硕士
     * 5: 博士
     * 6:
     * 7:
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
