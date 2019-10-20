package com.sunset.model;

import java.util.Date;

public class TRelation {
    private Integer id;

    private Integer persona;

    private Integer personb;

    private Integer state;

    private String personNamea;

    private String personNameb;

    private Date creattime;

    private Date birthday;

    private Integer sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPersona() {
        return persona;
    }

    public void setPersona(Integer persona) {
        this.persona = persona;
    }

    public Integer getPersonb() {
        return personb;
    }

    public void setPersonb(Integer personb) {
        this.personb = personb;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPersonNamea() {
        return personNamea;
    }

    public void setPersonNamea(String personNamea) {
        this.personNamea = personNamea == null ? null : personNamea.trim();
    }

    public String getPersonNameb() {
        return personNameb;
    }

    public void setPersonNameb(String personNameb) {
        this.personNameb = personNameb == null ? null : personNameb.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}