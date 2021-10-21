package com.company.service.validation.user;

import com.company.exception.UnAvailableUsernameInputException;
import com.company.service.registervalidate.user.UserNameService;

public class UsernameAvailableService { //extends ValidationService

    public static boolean isUsernameAvailableToRegister(String username) throws UnAvailableUsernameInputException {

        new UserNameService().isUsernameAvailableToRegister(username);

        return true;

    }
}
