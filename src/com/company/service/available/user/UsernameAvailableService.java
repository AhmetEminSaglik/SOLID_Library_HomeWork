package com.company.service.available.user;

import com.company.exception.UnAvailableUsernameInputException;
import com.company.service.registration.usercontent.UserNameService;

public class UsernameAvailableService { //extends ValidationService

    public static boolean isUsernameAvailableToRegister(String username) throws UnAvailableUsernameInputException {

        new UserNameService().isUsernameAvailableToRegister(username);

        return true;

    }
}
