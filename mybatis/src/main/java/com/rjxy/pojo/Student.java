package com.rjxy.pojo;

public class Student {
    private Integer sid;            //主键id
    private String sname;          //学生姓名
    private Integer sage;          //学生年龄

    @Override
    public String toString() {
        return "Student{" +
                "id=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }
}

