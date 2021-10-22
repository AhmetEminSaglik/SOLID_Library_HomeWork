package com.company.db.access;

import com.company.db.DAOAble;

import java.util.List;

public class ReadingDb<T> implements ReadableDb<T> {
    DAOAble<T> daoAble;

    public ReadingDb(DAOAble daoAble) {
        this.daoAble = daoAble;
    }


    @Override
    public List<T> getList() {
        return null;
    }
}
