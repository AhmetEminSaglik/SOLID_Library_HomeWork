package com.company.service.available.user;

import com.company.exception.UnAvailablePasswordInputException;
import com.company.service.registration.usercontent.PasswordService;

public class PasswordAvailableService {//extends ValidationService

    public static boolean isPasswordAvailableToRegister(String password) throws UnAvailablePasswordInputException {
        return PasswordService.isPasswordAvailableToRegister(password);
    }
}
