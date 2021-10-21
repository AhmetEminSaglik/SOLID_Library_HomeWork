package com.company.service.registration.db;

import com.company.db.DAOAble;
import com.company.entity.user.User;
import com.company.service.registration.UserRegistarationService;

public class UserRegistarationDB extends BaseRegistrationToDB<User> {
    DAOAble<User> daoAble;

    UserRegistarationService userRegistarationService;

    public UserRegistarationDB(DAOAble<User> daoAble) {
        this.daoAble = daoAble;
        userRegistarationService = new UserRegistarationService(daoAble);
    }


    @Override
    public void register(User user) {
        userRegistarationService.registerUser(user);
    }


   /* public UserRegistarationDB(DAOAble daoAble) {
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
