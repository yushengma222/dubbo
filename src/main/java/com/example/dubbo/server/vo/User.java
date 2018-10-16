package com.example.dubbo.server.vo;

import java.io.Serializable;

/**
 * @author yushengma
 */
public class User implements Serializable{
    private String userName;
    private int age;
    private String sex;

    public User() {
    }

    public User(String userName, int age, String sex) {
        this.userName = userName;
        this.age = age;
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
