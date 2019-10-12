package com.nguyenducmanh.model.request;

import java.util.List;

public class UserRequest {
    private String userName;

    private String password;

    private String fullName;

    private int status;

    private List<Long> ids;

    public List<Long> getIds() {

        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
