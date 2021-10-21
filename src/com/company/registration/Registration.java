package com.company.registration;

import com.company.db.DAOAble;
import com.company.exception.ExitRequestException;
import com.company.secureinput.SecureInput;

public class Registration {
    DAOAble daoAble;
    SecureInput secureInput = new SecureInput();

    public Registration(DAOAble daoAble) {
        this.daoAble = daoAble;
    }

    public void registerMultipleUser() {

//        RegistrationUser registrationUser = new RegistrationUser(daoAble);
        while (true) {
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

    public void registerMultipleBook() {
        while (true) {
            try {
                registerSingleBook();

            } catch (ExitRequestException e) {
                System.out.println(e.getRespondToRequest());
                return;
            }
        }
    }

    public void registerSingleBook() throws ExitRequestException {

        RegistrationBook registrationBook = new RegistrationBook(daoAble);
        registrationBook.registerBook();
    }


}
