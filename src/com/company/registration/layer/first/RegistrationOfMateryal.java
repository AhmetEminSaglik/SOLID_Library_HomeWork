package com.company.registration.layer.first;

import com.company.db.access.add.DAOAble;
import com.company.secureinput.SecureInput;

public class RegistrationOfMateryal {


    DAOAble daoAble;
    SecureInput secureInput = new SecureInput();

    public RegistrationOfMateryal(DAOAble daoAble) {
        this.daoAble = daoAble;
    }

    public RegistrationOfBook getBookRegistration() {
        return new RegistrationOfBook(daoAble);
    }

    public RegistrationOfMagazin getMagazinRegistration() {
        return new RegistrationOfMagazin(daoAble);
    }


  /*  public void registerMultipleBook() {
        while (true) {

            System.out.println("IF you want to exit please  enter  :  \"exit\"");
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
    }*/

}
