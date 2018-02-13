package com.ibm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    // information to connect to the SQL database
    // note: removed for security reasons
    private static String driverClass = "";
    private static String url = "";
    private static String dbUser = "";
    private static String dbPass = "";

    Connection connection;
    Statement statement;

    public void close() {
        if(connection != null) {
            try {
                connection.close();
            }
            catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public DAO() {
        try {
            Class.forName(driverClass);
            connection = DriverManager.getConnection(url, dbUser, dbPass);
            statement = connection.createStatement();
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
