package com.lm.pojo;

/**
 * Created by lm on 2017/6/7.
 */
public class User {
    private  int Id;
    private  String nema;
    private  int age;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNema() {
        return nema;
    }

    public void setNema(String nema) {
        this.nema = nema;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
