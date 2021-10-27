package com.company.db.access.read;

import com.company.db.access.add.DAOAble;

import java.util.List;

public abstract class ReadDb<T> implements ReadableDb<T> {
    public DAOAble<T> daoAble;

    public ReadDb(DAOAble daoAble) {
        this.daoAble = daoAble;

    }


    @Override
    public List<T> getList() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

//    @Override
//    protected void fillList() {
//
//    }
}
