package com.company.registered.subitem;

import com.company.db.access.add.DAOAble;
import com.company.db.access.read.ReadableDb;
import com.company.entity.book.Materyal;

import java.util.ArrayList;
import java.util.List;

public class RegisteredMateryal implements ReadableDb<Materyal> {
    DAOAble daoAble;
    List materyalList = new ArrayList<>();

    public RegisteredMateryal(DAOAble daoAble) {
        this.daoAble = daoAble;
    }

    @Override
    public List<Materyal> getList() {
//        int index = 0;
//        detectMateryalInDb(index);
        getMateryalnDb();

        return materyalList;
    }

    private void getMateryalnDb() {
//        RegisteredBook registeredBooks = new RegisteredBook(daoAble);
        materyalList = uniuonList(materyalList, getRegisteredBookList());
        materyalList = uniuonList(materyalList, getRegisteredMagazinList());

    }

    private List getRegisteredBookList() {
        RegisteredBook registeredBooks = new RegisteredBook(daoAble);
//        return registeredBooks.getList();
        return new RegisteredBook(daoAble).getList();
    }

    private List getRegisteredMagazinList() {
//        RegisteredMagazin registeredMagazin = new RegisteredMagazin(daoAble);
//        return registeredMagazin.getList();
        return new RegisteredMagazin(daoAble).getList();
    }
   /* private void detectMateryalInDb(int index) {

        try {
            if (index < daoAble.getAll().size()) {
                materyalList.add((Materyal) daoAble.getAll().get(index));

                index++;
                detectMateryalInDb(index);
            }
        } catch (ClassCastException ex) {
            index++;
            detectMateryalInDb(index);
        }


    }*/

    private List uniuonList(List list1, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }

        return list1;
    }


}
