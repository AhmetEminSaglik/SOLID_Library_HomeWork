package com.company.db.variable;

import com.company.db.access.add.DAOAble;
import com.company.db.Database;
import com.company.entity.Entity;
import com.company.service.dbconnection.DatabaseConnectionService;

import java.util.List;

public class MSSQLDB implements DAOAble<Entity> {
    Database database;

    public MSSQLDB() {
        System.out.println("Welcome to MSSQL Database");
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
        return "MSSQLDB{" +
                "database=" + database +
                '}';
    }
}
