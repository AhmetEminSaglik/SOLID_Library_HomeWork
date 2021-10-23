package com.company.db;

import com.company.db.access.add.DAOAble;
import com.company.entity.Entity;

import java.util.ArrayList;
import java.util.List;

public  class Database implements DAOAble<Entity> {
    List<Entity> list = new ArrayList();

    @Override
    public void add(Entity entity) {
        list.add(entity);
    }

    @Override
    public List<Entity> getAll() {
        return list;
    }

    @Override
    public String toString() {
        return "Database{" +
                "list=" + list +
                '}';
    }
}
