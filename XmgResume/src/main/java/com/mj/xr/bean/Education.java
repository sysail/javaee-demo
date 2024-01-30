package com.mj.xr.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Education extends BaseBean {
    private Integer id;
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

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String beginDayString = format.format(beginDay);
        String endDayString = format.format(endDay);
        return "{" +
                "name:'" + name +
                "', intro:'" + intro +
                "', beginDay:'" + beginDayString +
                "', endDay:'" + endDayString +
                "', type:" + type +
                "}";
    }

    @JsonIgnore
    public String getJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        return mapper.writeValueAsString(this).replace("\"", "'");
    }
}
