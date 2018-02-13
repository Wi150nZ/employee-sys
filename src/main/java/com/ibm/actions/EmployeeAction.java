package com.ibm.actions;

import com.ibm.beans.Employee;
import com.ibm.bo.EmployeeBO;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {
    private EmployeeBO employeeBO = new EmployeeBO();
    private Employee employeeBean;
    private String id;

    public Employee getEmployeeBean() {
        return employeeBean;
    }

    public void setEmployeeBean(Employee employeeBean) {
        this.employeeBean = employeeBean;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String addEmployee() {
        if(employeeBO.validateForm(employeeBean)) {
            employeeBO.recordEmployee(employeeBean);
            return "success";
        }
        return "failure";
    }

    public String getEmployee() {
        employeeBean = employeeBO.getEmployee(Integer.parseInt(id));
        return "success";
    }

    public String editEmployee() {
        if(employeeBO.validateForm(employeeBean)) {
            System.out.println(id);
            employeeBO.updateEmployee(employeeBean, id);
            return "success";
        }
        return "failure";
    }
}
