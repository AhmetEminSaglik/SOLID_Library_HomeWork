package com.company.service.registervalidate.user;


import com.company.exception.UnAvailablePasswordInputException;

public class PasswordService {
    public static boolean isPasswordAvailableToRegister(String password) throws UnAvailablePasswordInputException {
     /*if (userName.getUserName().trim().length() > 0) {
            return true;
        }*/
        String passwordCheck = password.trim();
        if (passwordCheck.length() > 0) {
            return true;
        }
        throw  new UnAvailablePasswordInputException("UNAVAILABLE PASSWORD INPUT");
    }
}
