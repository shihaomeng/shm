package com.shm.entity;

import java.util.List;

public class Studentt {
    private int id;
    private String name;
    private String phone;
    private String tid;
    private String tname;
    private List<Utype> utypelist;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Utype> getUtypelist() {
        return utypelist;
    }

    public void setUtypelist(List<Utype> utypelist) {
        this.utypelist = utypelist;
    }

    @Override
    public String toString() {
        return "Studentt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", utypelist=" + utypelist +
                '}';
    }
}
