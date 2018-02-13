package com.ibm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    // information to connect to the SQL database
    private static String driverClass = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://ibm-admin-hp.usla.ibm.com:3306/scc?useSSL=true";
    private static String dbUser = "scc";
    private static String dbPass = "scc";

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
