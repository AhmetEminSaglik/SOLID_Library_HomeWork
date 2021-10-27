package com.company.registered.subitem;

import com.company.db.access.add.DAOAble;
import com.company.db.access.read.ReadDb;
import com.company.entity.magazin.Magazin;

import java.util.ArrayList;
import java.util.List;

public class ReadRegisteredMagazin extends ReadDb<Magazin>  {
//    DAOAble daoAble;
    List<Magazin> magazinList = new ArrayList<>();

    public ReadRegisteredMagazin(DAOAble daoAble) {
        super(daoAble);
//        this.daoAble = daoAble;
//        fillList();
    }

    @Override
    public List<Magazin> getList() {
        int index = 0;
        detectMagazinInDb(index);
        return magazinList;
    }

    @Override
    public int size() {
//        if(magazinList==null)
//        return magazinList.size();
        return getList().size();

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
