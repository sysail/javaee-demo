package com.mj.xr.bean;

import java.util.Date;

public class Education extends BaseBean {
    private String name;
    private String intro;
    private Date beginDay;
    private Date endDay;
    private int type;

    public String getTypeString() {
        switch (type) {
            case 0: return "其他";
            case 1: return "小学";
            case 2: return "初中";
            case 3: return "高中";
            case 4: return "中专";
            case 5: return "大专";
            case 6: return "本科";
            case 7: return "硕士";
            case 8: return "博士";
            default: return "";
        }
    }

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
