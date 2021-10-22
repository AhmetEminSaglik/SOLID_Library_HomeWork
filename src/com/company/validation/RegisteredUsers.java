package com.company.validation;

import com.company.db.DAOAble;
import com.company.db.access.ReadableDb;
import com.company.entity.user.User;

import java.util.ArrayList;
import java.util.List;

public class RegisteredUsers implements ReadableDb<User> {
    DAOAble<User> daoAble;
    List<User> userList = new ArrayList<>();

    public RegisteredUsers(DAOAble<User> daoAble) {
        this.daoAble = daoAble;
    }

    @Override
    public List<User> getList() {
        int index = 0;
        detectUsersInDb(index);
        return userList;
    }


    private void detectUsersInDb(int index) {

        try {
            if (index < daoAble.getAll().size()) {
                userList.add((User) daoAble.getAll().get(index));

                index++;
                detectUsersInDb(index);
            }
        } catch (ClassCastException ex) {
            index++;
            detectUsersInDb(index);
        }


    }
}
