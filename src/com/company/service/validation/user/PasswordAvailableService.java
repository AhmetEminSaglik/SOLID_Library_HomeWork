package com.company.service.validation.user;

import com.company.exception.UnAvailablePasswordInputException;
import com.company.service.registervalidate.user.PasswordService;

public class PasswordAvailableService {//extends ValidationService

    public static boolean isPasswordAvailableToRegister(String password) throws UnAvailablePasswordInputException {
        return PasswordService.isPasswordAvailableToRegister(password);
    }
}
