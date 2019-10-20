package com.sunset.model;

import javax.persistence.Id;
import java.util.Date;

public class TRecord {
    @Id
    private Integer id;

    private String uid;

    private Integer pid;

    private Date creattime;

    private Double nowprice;

    private Double beforeprice;

    private Double addprice;

    private String productname;

    private Date starttime;

    private Date endtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
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

    public Double getNowprice() {
        return nowprice;
    }

    public void setNowprice(Double nowprice) {
        this.nowprice = nowprice;
    }

    public Double getBeforeprice() {
        return beforeprice;
    }

    public void setBeforeprice(Double beforeprice) {
        this.beforeprice = beforeprice;
    }

    public Double getAddprice() {
        return addprice;
    }

    public void setAddprice(Double addprice) {
        this.addprice = addprice;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}