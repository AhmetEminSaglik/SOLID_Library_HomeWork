package com.company.registration;

import com.company.db.DAOAble;
import com.company.secureinput.SecureInput;

public class Registration {
    DAOAble daoAble;
    SecureInput secureInput = new SecureInput();

    public Registration(DAOAble daoAble) {
        this.daoAble = daoAble;
    }

    public void registerUserInWhileLoop() {
        RegistrationUser registrationUser = new RegistrationUser(daoAble);
        registrationUser.registerUserAsMuchAsWeWant();

    }

    public void registerBookInWhileLoop() {

        RegistrationBook registrationBook = new RegistrationBook(daoAble);
        registrationBook.registerBookAsMuchAsWeWant();
    }


}
