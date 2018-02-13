package com.ibm.dao;

import com.ibm.beans.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// this class serves as a middleman for accessing the SQL database
public class EmployeeDAO extends DAO {
    public Employee getEmployeeById(int id) {
        Employee employee = new Employee();
        String query = String.format("SELECT * FROM EMPLOYEE WHERE id=%d", id);
        try {
            ResultSet result = statement.executeQuery(query);
            if(!result.next()) {
                return null;
            }
            employee.setID(id);
            employee.setfName(result.getString("FIRST_NAME"));
            employee.setlName(result.getString("LAST_NAME"));
            employee.setAddress(result.getString("ADDRESS"));
            employee.setCity(result.getString("CITY"));
            employee.setState(result.getString("STATE"));
            employee.setZip(result.getString("ZIP"));
            employee.setCellNum(result.getString("CELL_PHONE"));
            employee.setHomeNum(result.getString("HOME_PHONE"));
            employee.setEmail(result.getString("EMAIL"));
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        String query = "SELECT * FROM EMPLOYEE";
        try {
            ResultSet result = statement.executeQuery(query);
            while(result.next()) {
                employees.add(new Employee(result.getInt("ID"), result.getString("FIRST_NAME"), result.getString("LAST_NAME"),
                        result.getString("ADDRESS"), result.getString("CITY"), result.getString("STATE"),
                        result.getString("ZIP"), result.getString("HOME_PHONE"), result.getString("CELL_PHONE"),
                        result.getString("EMAIL")));
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public void addEmployee(Employee employee) {
        String query = String.format("INSERT INTO EMPLOYEE (FIRST_NAME, LAST_NAME, ADDRESS, CITY, STATE, ZIP, CELL_PHONE, HOME_PHONE, EMAIL) VALUES (\'%s\', \'%s\', \'%s\', \'%s\', \'%s\', \'%s\', \'%s\', \'%s\', \'%s\');",
                employee.getfName(), employee.getlName(), employee.getAddress(),
                employee.getCity(), employee.getState(), employee.getZip(), employee.getCellNum(), employee.getHomeNum(),
                employee.getEmail());
        try {
            connection.prepareStatement(query).execute();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEmployee(Employee employee, String id) {
        String query = String.format("UPDATE EMPLOYEE SET FIRST_NAME=\'%s\', LAST_NAME=\'%s\', ADDRESS=\'%s\', CITY=\'%s\', STATE=\'%s\', ZIP=\'%s\', CELL_PHONE=\'%s\', HOME_PHONE=\'%s\', EMAIL=\'%s\' WHERE ID=%s;",
                employee.getfName(), employee.getlName(), employee.getAddress(),
                employee.getCity(), employee.getState(), employee.getZip(), employee.getCellNum(), employee.getHomeNum(),
                employee.getEmail(), id);
        try {
            connection.prepareStatement(query).execute();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // THIS IS FOR TESTING PURPOSES ONLY!
    public void deleteEmployee(int ID) {
        String query = String.format("DELETE FROM EMPLOYEE WHERE ID=%d", ID);
        try {
            connection.prepareStatement(query).execute();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
