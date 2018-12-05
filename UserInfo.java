package com.neusoft.domain;

/**
 * Created by Administrator on 2018/12/4.
 */
public class UserInfo {
    private String username;
    private int age;
    private String jiguan;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJiguan() {
        return jiguan;
    }

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", jiguan='" + jiguan + '\'' +
                '}';
    }
}
