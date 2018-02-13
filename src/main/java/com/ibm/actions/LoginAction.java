package com.ibm.actions;


import com.ibm.beans.User;
import com.ibm.bo.LoginBO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private LoginBO loginBO = new LoginBO(); // todo: autowire it when we add Spring Boot to save on memory!
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String execute() {
        if(loginBO.validateForm(user.getEmail(), user.getPassword())) {
            if(loginBO.validateCreds(user.getEmail(), user.getPassword())) {
                return "success";
            }
            return "failure";
        }
        return "failure";
    }
}
