package com.company.service.registration.db;

import com.company.db.access.add.DAOAble;
import com.company.entity.Entity;
import com.company.entity.user.User;
import com.company.service.registration.UserRegistrationService;

public class UserRegistrationDB /*extends BaseRegistrationToDB<User> */ implements RegisterAbleToDB<User> {
    DAOAble<User> daoAble;

    UserRegistrationService userRegistarationService;

    public UserRegistrationDB(DAOAble<User> daoAble) {
        this.daoAble = daoAble;
        userRegistarationService = new UserRegistrationService(daoAble);
    }


    @Override
    public void register(User user) {
//        userRegistarationService.registerUser(user);

        daoAble.add(user);
        for (Entity tmp : daoAble.getAll()) {
            System.out.println("                                         "+tmp);
        }
    }


   /* public UserRegistrationDB(DAOAble daoAble) {
        super(daoAble);
    }

    @Override
    public void register(User user) {
        daoAble.add(user);
        System.out.println(" Ekli Userlar : ");
        for (User tmp : daoAble.getAll()) {
            System.out.println(tmp);
        }
    }*/
}
