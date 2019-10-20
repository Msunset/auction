package com.sunset.Mentity;

import java.util.List;

/**
 * @author sunset
 * @date 2019-10-18 17:11
 */
public class Result{
    private boolean flag;
    private String msg;
    private Integer state;
    private Object data;

    public Result() {
    }

    public Result(boolean flag, String msg, Integer state, Object data) {
        this.flag = flag;
        this.msg = msg;
        this.state = state;
        this.data = data;
    }

    public Result(boolean flag, String msg, Integer state) {
        this.flag = flag;
        this.msg = msg;
        this.state = state;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
