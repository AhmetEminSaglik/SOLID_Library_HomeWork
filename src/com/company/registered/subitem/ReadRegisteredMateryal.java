package com.company.registered.subitem;

import com.company.db.access.add.DAOAble;
import com.company.db.access.read.ReadDb;
import com.company.entity.book.Materyal;

import java.util.ArrayList;
import java.util.List;

public class ReadRegisteredMateryal extends ReadDb<Materyal>/* implements ReadableDb<Materyal>*/ {
//    DAOAble daoAble;
    List materyalList = new ArrayList<>();

    public ReadRegisteredMateryal(DAOAble daoAble) {
        super(daoAble);
//        this.daoAble = daoAble;
    }

    @Override
    public List<Materyal> getList() {
//        int index = 0;
//        detectMateryalInDb(index);
        getMateryalnDb();

        return materyalList;
    }

    @Override
    public int size() {
        return getList().size();
    }


    private void getMateryalnDb() {
//        ReadRegisteredBook registeredBooks = new ReadRegisteredBook(daoAble);
        materyalList = uniuonList(materyalList, getRegisteredBookList());
        materyalList = uniuonList(materyalList, getRegisteredMagazinList());

    }

    private List getRegisteredBookList() {
        ReadRegisteredBook registeredBooks = new ReadRegisteredBook(daoAble);
//        return registeredBooks.getList();
        return new ReadRegisteredBook(daoAble).getList();
    }

    private List getRegisteredMagazinList() {
//        ReadRegisteredMagazin registeredMagazin = new ReadRegisteredMagazin(daoAble);
//        return registeredMagazin.getList();
        return new ReadRegisteredMagazin(daoAble).getList();
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
