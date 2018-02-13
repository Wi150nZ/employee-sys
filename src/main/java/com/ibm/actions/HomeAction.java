package com.ibm.actions;

import com.ibm.beans.Employee;
import com.ibm.dao.EmployeeDAO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

public class HomeAction extends ActionSupport {
    private EmployeeDAO employeeDAO = new EmployeeDAO(); // todo: autowire it when we add Spring Boot to save on memory!
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public String execute() {
        employees = employeeDAO.getAllEmployees();
        return "success";
    }
}
