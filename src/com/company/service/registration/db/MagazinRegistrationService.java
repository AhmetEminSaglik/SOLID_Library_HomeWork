package com.company.service.registration.db;

import com.company.db.access.add.DAOAble;
import com.company.entity.magazin.Magazin;


public class MagazinRegistrationService {
    DAOAble<Magazin> daoAble;

    public MagazinRegistrationService(DAOAble<Magazin> daoAble) {
        this.daoAble = daoAble;
    }

    public void registerMagazin(Magazin magazin) {
        daoAble.add(magazin);
    }
}
