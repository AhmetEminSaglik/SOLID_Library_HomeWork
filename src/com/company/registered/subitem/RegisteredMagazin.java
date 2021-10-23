package com.company.registered.subitem;

import com.company.db.access.add.DAOAble;
import com.company.db.access.read.ReadableDb;
import com.company.entity.magazin.Magazin;

import java.util.ArrayList;
import java.util.List;

public class RegisteredMagazin implements ReadableDb<Magazin> {
    DAOAble daoAble;
    List<Magazin> magazinList = new ArrayList<>();

    public RegisteredMagazin(DAOAble daoAble) {
        this.daoAble = daoAble;
    }

    @Override
    public List<Magazin> getList() {
        int index = 0;
        detectMagazinInDb(index);
        return magazinList;
    }

    private void detectMagazinInDb(int index) {

        try {
            if (index < daoAble.getAll().size()) {
                magazinList.add((Magazin) daoAble.getAll().get(index));

                index++;
                detectMagazinInDb(index);
            }
        } catch (ClassCastException ex) {
            index++;
            detectMagazinInDb(index);
        }


    }
}
