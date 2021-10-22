package com.company.entity.user.content;

public class Username {
    String name;

    public Username(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
