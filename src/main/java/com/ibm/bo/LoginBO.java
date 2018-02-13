package com.ibm.bo;

import com.ibm.beans.User;
import com.ibm.dao.LoginDAO;

public class LoginBO {
    private LoginDAO dao; // todo: autowire it!

    // check if the user meets the requirements of logging into the system
    public boolean validateForm(String email, String pass) {
        // length validation
        if((email.length() < 8 || email.length() > 35) && (pass.length() < 8 || pass.length() > 35)) {
            return false;
        }
        // use regex to see if the email is of valid syntax, rather than iterating through the string itself
        if(!email.matches("^[a-zA-Z0-9._+-]+@[a-zA-Z0-9]+.(com|edu|org)")) {
            return false;
        }
        return true;
    }

    // check if the user has authority to access the system
    public boolean validateCreds(String email, String pass) {
        User data = dao.getLoginByEmail(email);
        if(data != null) {
            return pass.equals(data.getPassword());
        }
        return false;
    }

    public LoginBO() {
        dao = new LoginDAO();
    }
}
