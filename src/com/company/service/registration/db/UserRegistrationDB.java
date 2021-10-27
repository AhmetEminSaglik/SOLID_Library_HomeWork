package com.company.service.registration.db;

import com.company.PrintDbList;
import com.company.db.access.add.DAOAble;
import com.company.entity.Entity;
import com.company.entity.user.User;
import com.company.registered.RegisteredItemInDb;
import com.company.registered.subitem.RegisteredUsers;
import com.company.service.registration.UserRegistrationService;

import java.util.List;

public class UserRegistrationDB /*extends BaseRegistrationToDB<User> */ implements RegisterAbleToDB<User> {
    DAOAble<User> daoAble;

    UserRegistrationService userRegistarationService;

    public UserRegistrationDB(DAOAble<User> daoAble) {
        this.daoAble = daoAble;
        userRegistarationService = new UserRegistrationService(daoAble);
    }


    @Override
    public void register(User user) {
        daoAble.add(user);
        printList(getUserListInDb());
    }

    private List getUserListInDb() {
        return new RegisteredUsers(daoAble).getList();

    }

    private void printList(List list) {
        PrintDbList.printList(list);
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
