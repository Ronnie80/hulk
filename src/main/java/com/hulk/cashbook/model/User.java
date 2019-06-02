package com.hulk.cashbook.model;

import java.util.List;

/**
 * Created by Jacky on 2017/6/14.
 */
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String permission;
    private List<Model> models;

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        System.out.println("userId:" + id + ",username:" + userName + ",password:" + password );
        return "User [id=" + id + ", username=" + userName +"] ";
    }
}
