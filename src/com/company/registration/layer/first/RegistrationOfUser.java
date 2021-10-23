package com.company.registration.layer.first;

import com.company.db.access.add.DAOAble;
import com.company.entity.user.User;
import com.company.exception.ExitRequestException;
import com.company.registration.layer.second.RegistrationUser;

public class RegistrationOfUser {
    DAOAble<User> daoAble;

    public RegistrationOfUser(DAOAble<User> daoAble) {
        this.daoAble = daoAble;
    }

    public void registerMultipleUser() {

//        RegistrationUser registrationUser = new RegistrationUser(daoAble);
        while (true) {
            System.out.println("IF you want to exit please  enter  :  \"exit\"");
            try {
                registerSingleUser();
            } catch (ExitRequestException e) {
                System.out.println(e.getRespondToRequest());
                return;
            }
        }


    }

    public void registerSingleUser() throws ExitRequestException {
        RegistrationUser registrationUser = new RegistrationUser(daoAble);
          registrationUser.registerUser();


    }
}
