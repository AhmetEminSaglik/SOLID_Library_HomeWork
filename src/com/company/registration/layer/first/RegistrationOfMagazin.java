package com.company.registration.layer.first;

import com.company.db.access.add.DAOAble;
import com.company.entity.magazin.Magazin;
import com.company.exception.ExitRequestException;
import com.company.registration.layer.second.RegistrationMagazin;

public class RegistrationOfMagazin {
    DAOAble<Magazin> daoAble;

    public RegistrationOfMagazin(DAOAble<Magazin> daoAble) {
        this.daoAble = daoAble;
    }

    public void registerMultipleMagazin() {
        while (true) {

            System.out.println("IF you want to exit please  enter  :  \"exit\"");
            try {
                registerSingleMagazin();

            } catch (ExitRequestException e) {
                System.out.println(e.getRespondToRequest());
                return;
            }
        }
    }


    public void registerSingleMagazin() throws ExitRequestException {

//        RegistrationBook registrationBook = new RegistrationBook(daoAble);
//        registrationBook.registerBook();
        RegistrationMagazin registrationMagazin = new RegistrationMagazin(daoAble);

          registrationMagazin.registerMagazin();
    }
}
