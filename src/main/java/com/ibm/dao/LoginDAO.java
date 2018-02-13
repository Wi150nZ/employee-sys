package com.ibm.dao;

import com.ibm.beans.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO extends DAO {
    public User getLoginByEmail(String email) {
        User login = new User();
        String query = String.format("SELECT * FROM EMPLOYEE_LOGIN WHERE EMAIL=\'%s\'", email);
        try {
            ResultSet result = statement.executeQuery(query);
            if(!result.next()) {
                return null;
            }
            login.setEmail(email);
            login.setPassword(result.getString("PASSWORD"));
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return login;
    }
}
