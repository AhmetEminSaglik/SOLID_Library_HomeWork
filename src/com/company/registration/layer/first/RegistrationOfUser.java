package com.company.registration.layer.first;

import com.company.db.DAOAble;
import com.company.exception.ExitRequestException;
import com.company.registration.layer.second.RegistrationUser;
import com.company.secureinput.SecureInput;

public class RegistrationOfUser {
    DAOAble daoAble;
    SecureInput secureInput = new SecureInput();

    public RegistrationOfUser(DAOAble daoAble) {
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
