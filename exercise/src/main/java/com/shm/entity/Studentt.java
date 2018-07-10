package com.shm.entity;

import java.util.List;

public class Studentt {
    private int id;
    private String name;
    private String phone;
    private int tid;
    private String tname;
    private List<Utype> utypeList;

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

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Utype> getUtypeList() {
        return utypeList;
    }

    public void setUtypeList(List<Utype> utypeList) {
        this.utypeList = utypeList;
    }

    @Override
    public String toString() {
        return "Studentt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", tid=" + tid +
                ", tname='" + tname + '\'' +
                ", utypeList=" + utypeList +
                '}';
    }
}
