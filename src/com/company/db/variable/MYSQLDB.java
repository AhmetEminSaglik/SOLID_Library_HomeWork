package com.company.db.variable;

import com.company.db.DAOAble;
import com.company.db.Database;
import com.company.service.dbconnection.DatabaseConnectionService;
import com.company.entity.Entity;

import java.util.List;

public class MYSQLDB implements DAOAble<Entity> {
    Database database;

    public MYSQLDB() {
        System.out.println("Welcome to MYSQL Database");
        database = DatabaseConnectionService.connectAndGetDatabase();
    }

    @Override
    public void add(Entity entity) {
        database.add(entity);
    }

    @Override
    public List<Entity> getAll() {
        return database.getAll();
    }

    @Override
    public String toString() {
        return "MYSQLDB{" +
                "database=" + database +
                '}';
    }
}
