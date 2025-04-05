package com.hfut.bean;

//用户信息：用户名，密码，登录名
public class User {
    private String username;
    private String password;
    private String loginName;

    public User() {
    }

    public User(String username, String password, String loginName) {
        this.username = username;
        this.password = password;
        this.loginName = loginName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
