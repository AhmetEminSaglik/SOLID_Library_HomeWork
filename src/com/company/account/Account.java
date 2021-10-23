package com.company.account;

import com.company.entity.user.User;

public class Account {
    User user;

    public Account(User user) {
        this.user = user;
        System.out.println("Welcome to your Account : " + user.getUserName().getName());
            }
}
