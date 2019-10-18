package com.sunset.model;

import java.io.Serializable;
import java.util.Date;

public class Record implements Serializable {

    private Integer id;
    private Integer uid;
    private Integer pid;
    private Date creattime;
    private double nowprice;
    private double beforeprice;
    private double addprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public double getNowprice() {
        return nowprice;
    }

    public void setNowprice(double nowprice) {
        this.nowprice = nowprice;
    }

    public double getBeforeprice() {
        return beforeprice;
    }

    public void setBeforeprice(double beforeprice) {
        this.beforeprice = beforeprice;
    }

    public double getAddprice() {
        return addprice;
    }

    public void setAddprice(double addprice) {
        this.addprice = addprice;
    }

    public Record() {
    }

    public Record(Integer id, Integer uid, Integer pid, Date creattime, double nowprice, double beforeprice, double addprice) {
        this.id = id;
        this.uid = uid;
        this.pid = pid;
        this.creattime = creattime;
        this.nowprice = nowprice;
        this.beforeprice = beforeprice;
        this.addprice = addprice;
    }
}
