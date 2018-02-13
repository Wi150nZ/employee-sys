package com.ibm.bo;

import com.ibm.beans.Employee;
import com.ibm.dao.EmployeeDAO;

public class EmployeeBO {
    private EmployeeDAO employeeDAO;

    public boolean validateForm(Employee employee) {
        // name validation
        if((employee.getfName().length() < 2 || employee.getfName().length() > 35) && (employee.getlName().length() < 2 || employee.getlName().length() > 35)) {
            return false;
        }
        // location validation
        else if((employee.getAddress().length() < 10 || employee.getAddress().length() > 50) && (employee.getCity().length() < 5 || employee.getCity().length() > 50) && (employee.getState().length() != 2)) {
            return false;
        }
        // zip validation
        else if(employee.getZip().length() < 5 || employee.getZip().length() > 9) {
            return false;
        }
        // contact information validation
        else if((employee.getHomeNum().length() != 10) && (employee.getCellNum().length() != 10) && (employee.getEmail().length() < 10 || employee.getEmail().length() > 50)) {
            return false;
        }
        else if(!employee.getEmail().matches("^[a-zA-Z0-9._+-]+@[a-zA-Z0-9]+.(com|edu|org)")) {
            return false;
        }
        return true;
    }

    public void recordEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }

    public void updateEmployee(Employee employee, String id) {
        employeeDAO.updateEmployee(employee, id);
    }

    public Employee getEmployee(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    public EmployeeBO() {
        employeeDAO = new EmployeeDAO();
    }
}
