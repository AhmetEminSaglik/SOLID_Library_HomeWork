package com.company.service.registration;

import com.company.db.DAOAble;
import com.company.entity.user.User;

public class UserRegistarationService {
    DAOAble<User> daoAble;

    public UserRegistarationService(DAOAble<User> daoAble) {
        this.daoAble = daoAble;
    }

    public void registerUser(User user) {
        daoAble.add(user);
        System.out.println(" Ekli Userlar : ");
        for (User tmp : daoAble.getAll()) {
            System.out.println(tmp);
        }
    }

}
