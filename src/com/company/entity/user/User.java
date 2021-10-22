package com.company.entity.user;

import com.company.entity.Entity;
import com.company.entity.user.content.Password;
import com.company.entity.user.content.Username;

public class User extends Entity<User> {
    Username userName;
    Password password;

    public User(Username userName, Password password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName=" + userName +
                ", password=" + password +
                '}';
    }

    public Username getUserName() {
        return userName;
    }

    public Password getPassword() {
        return password;
    }
}
