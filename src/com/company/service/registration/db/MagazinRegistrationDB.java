package com.company.service.registration.db;

import com.company.db.access.add.DAOAble;
import com.company.entity.Entity;
import com.company.entity.magazin.Magazin;

public class MagazinRegistrationDB implements RegisterAbleToDB<Magazin> {
    DAOAble<Magazin> daoAble;

    MagazinRegistrationService magazinRegistrationService;

    public MagazinRegistrationDB(DAOAble<Magazin> daoAble) {
        this.daoAble = daoAble;
        magazinRegistrationService = new MagazinRegistrationService(daoAble);
    }

    @Override
    public void register(Magazin magazin) {
        magazinRegistrationService.registerMagazin(magazin);
        for (Entity tmp : daoAble.getAll()) {
            System.out.println("                                         "+tmp);
        }
    }
}
