package com.example.mvvmdemo.home.data;

/**
 * created by tl
 * created at 2020/8/12
 */
public class UserBean {
    private String name;
    private String age;

    public UserBean(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
