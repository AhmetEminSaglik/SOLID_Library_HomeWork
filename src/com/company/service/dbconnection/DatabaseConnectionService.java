package com.company.service.dbconnection;

import com.company.db.Database;
import com.company.db.connection.ConnectionToDatabase;

public class DatabaseConnectionService {

    public static Database connectAndGetDatabase() {
        return new ConnectionToDatabase().connectToDatabase();

    }
}
