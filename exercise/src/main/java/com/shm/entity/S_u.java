package com.shm.entity;

public class S_u {
    private int id;
    private int tid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "S_u{" +
                "id=" + id +
                ", tid=" + tid +
                '}';
    }
}
