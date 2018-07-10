package com.shm.entity;

public class Utype {
    private int tid;
    private String name;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Utype{" +
                "tid=" + tid +
                ", name='" + name + '\'' +
                '}';
    }
}
