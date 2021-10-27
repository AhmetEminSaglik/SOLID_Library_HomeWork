package com.company.registered.subitem;

import com.company.db.access.add.DAOAble;
import com.company.db.access.read.ReadDb;
import com.company.entity.book.Book;
import com.company.entity.magazin.Magazin;

import java.util.ArrayList;
import java.util.List;

public class ReadRegisteredBook extends ReadDb<Book> {
//    DAOAble daoAble;
    List<Book> booklList = new ArrayList<>();

    public ReadRegisteredBook(DAOAble daoAble) {
        super(daoAble);
//        this.daoAble = daoAble;
    }

    @Override
    public List<Book> getList() {
        int index = 0;
        detectBookInDb(index);
        return booklList;
    }

    @Override
    public int size() {
        return getList().size();
    }

    private void detectBookInDb(int index) {

        try {
            if (index < daoAble.getAll().size()) {
              /*  if (((Magazin) daoAble.getAll().get(index)).getClass().getTypeName().equals( Magazin.class.getTypeName())) {
                    throw new ClassCastException(daoAble.getAll().get(index).getClass().getTypeName()+" is a MAGAZIN ????? ");
                }*/
                Book book = (Book) daoAble.getAll().get(index);
                if (!book.getClass().getTypeName().equals(Magazin.class.getTypeName()))// {
                    booklList.add(book);
//                } else {
//                    throw new ClassCastException(daoAble.getAll().get(index).getClass().getTypeName() + " is a MAGAZIN ????? ");
//                }

                index++;
                detectBookInDb(index);
            }
        } catch (ClassCastException ex) {
//            System.out.println(ex.getMessage() + "  HATAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            index++;
            detectBookInDb(index);
        }


    }
}
