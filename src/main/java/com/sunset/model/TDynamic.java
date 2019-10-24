package com.sunset.model;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TDynamic {
    @Id
    private Integer id;

    private Integer uid;

    private String uname;

    private Date creattime;

    private String headphoto;

    private Object image;

    private String content;

    private Integer addlike;

    private Integer state;

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

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getHeadphoto() {
        return headphoto;
    }

    public void setHeadphoto(String headphoto) {
        this.headphoto = headphoto;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAddlike() {
        return addlike;
    }

    public void setAddlike(Integer addlike) {
        this.addlike = addlike;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}