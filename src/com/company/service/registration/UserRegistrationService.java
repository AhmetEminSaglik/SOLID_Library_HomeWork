package com.company.service.registration;

import com.company.db.DAOAble;
import com.company.entity.user.User;


public class UserRegistrationService {
    DAOAble<User> daoAble;


    public UserRegistrationService(DAOAble<User> daoAble) {
        this.daoAble = daoAble;

    }

    public void registerUser(User user) {
        daoAble.add(user);

//        System.out.println(getClass().getSimpleName() + "-)  Ekli Userlar : ");

//        RequestedTypeEntityDB<User> requestedTypeEntityDB = new RequestedTypeEntityDB<User>(daoAble);
//        List<User> list = requestedTypeEntityDB.getAll();
//        for (User tmp : list) {
//            System.out.println(tmp.toString());
//        }
//
//        for (Entity tmp : daoAble.getAll()) {
//            System.out.println(tmp.toString());
//        }
    }


}
