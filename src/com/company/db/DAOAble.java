package com.company.db;

import java.util.List;

public interface DAOAble<T> {
    public void add(T t);

    public List<T> getAll();

}
