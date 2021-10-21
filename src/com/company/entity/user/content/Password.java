package com.company.entity.user.content;

public class Password {
    String password;

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return  password ;
    }
}
