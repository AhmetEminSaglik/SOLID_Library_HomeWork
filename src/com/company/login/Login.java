package com.company.login;

import com.company.account.Account;
import com.company.db.access.add.DAOAble;
import com.company.entity.user.User;
import com.company.validation.Validation;

public class Login {
    DAOAble<User> daoAble;


    public Login(DAOAble daoAble) {
        this.daoAble = daoAble;
    }

    /*  public Login(User user) {
        this.user = user;

    }*/


    public Account loginToAccount() {
        User user;

        LoginInput loginInput = new LoginInput();
        Validation validation = new Validation(daoAble);

        for (int i = 0; i < 3; i++) {
            System.out.println("i : -------------------------------------------------------------------" + i);
            System.out.println();
            user = loginInput.getUserLoginInput();

            boolean validationSuccesfull = validation.validateLoginProcess(user);

            if (validationSuccesfull == true) {
                Account account = new Account(user);
                return account;
            } else {
                System.out.println("UnValid Username or Password");
            }


        }
        System.out.println("3 kez yanlis girdikten sonra sistem bloke olmustur");
return null;

    }
}
