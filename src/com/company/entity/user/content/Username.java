package com.company.entity.user.content;

public class Username {
    String userName;

    public Username(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return userName;
    }
}
