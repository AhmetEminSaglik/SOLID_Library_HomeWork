package com.company.db.connection;

import com.company.db.Database;

public class ConnectionToDatabase {
    static Database database = new Database();

    public Database connectToDatabase() {
        return database;
    }
}
