package com.company.service.registration.db;

import com.company.PrintDbList;
import com.company.db.access.add.DAOAble;
import com.company.entity.magazin.Magazin;
import com.company.registered.subitem.ReadRegisteredMagazin;

import java.util.List;

public class MagazinRegistrationDB implements RegisterAbleToDB<Magazin> {
    DAOAble<Magazin> daoAble;

    MagazinRegistrationService magazinRegistrationService;

    public MagazinRegistrationDB(DAOAble<Magazin> daoAble) {
        this.daoAble = daoAble;
        magazinRegistrationService = new MagazinRegistrationService(daoAble);
    }

    @Override
    public void register(Magazin magazin) {
//        magazinRegistrationService.registerMagazin(magazin);
        daoAble.add(magazin);
        printList(getMagazinListInDb());

    }

    private List<Magazin> getMagazinListInDb() {
//        ReadableDb
        return new ReadRegisteredMagazin(daoAble).getList();

    }

    private void printList(List list) {
        PrintDbList.printList(list);
    }
}
