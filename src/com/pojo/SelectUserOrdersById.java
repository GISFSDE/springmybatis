package com.pojo;

public class SelectUserOrdersById {
    private Integer uid;
    private String uname;
    private String usex;
    private Integer id;
    private String ordersn;

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

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersn() {
        return ordersn;
    }

    public void setOrdersn(String ordersn) {
        this.ordersn = ordersn;
    }

    // 省略setter和getter方法
    @Override
    public String toString() { // 为了方便查看结果，重写了toString方法
        return "User[uid=" + uid + ",uname=" + uname + ",usex=" + usex
                + ",oid=" + id + ",ordersn=" + ordersn + "]";
    }
}
