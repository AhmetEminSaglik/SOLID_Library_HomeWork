package com.company.service.registration;

import com.company.db.access.add.DAOAble;
import com.company.entity.user.User;
import com.company.service.registration.db.UserRegistrationDB;


public class UserRegistrationService {
    DAOAble<User> daoAble;


    public UserRegistrationService(DAOAble<User> daoAble) {
        this.daoAble = daoAble;

    }

    public void registerUser(User user) {
//        daoAble.add(user);
        UserRegistrationDB userRegistrationDB = new UserRegistrationDB(daoAble);
        userRegistrationDB.register(user);

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
