/*
package com.company.service.registration;

import com.company.db.access.add.DAOAble;

import java.util.ArrayList;
import java.util.List;

public class RequestedTypeEntityDB<T> implements AccessibleList<T> {

    List<T> listRequestType = new ArrayList<T>();
    DAOAble daoAble;

    public RequestedTypeEntityDB(DAOAble daoAble) {
        this.daoAble = daoAble;
//        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA :"+listRequestType.getClass().getTypeName());
    }

    @Override
    public List<T> getAll() {
        System.out.println(" T : "+getClass().getName());
        int index = 0;
        return prepareRequestTypeList(index);
    }

    List<T> prepareRequestTypeList(int index) {

        try {
            if (index < daoAble.getAll().size()) {


                T t = (T) daoAble.getAll().get(index);
                System.out.println(t);
                listRequestType.add(t);

                index++;
                prepareRequestTypeList(index);
            }

        } catch (ClassCastException ex) {
            System.out.println("CATHHHH GELLDIIIIIIIIIIIIIIIIIIIIIIIIIIII ");
            index++;
            prepareRequestTypeList(index);
        }

        return listRequestType;
    }
}
*/
