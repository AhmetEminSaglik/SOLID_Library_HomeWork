package com.company.service.registration.usercontent;

import com.company.exception.UnAvailableUsernameInputException;

public class UserNameService {

    /*public boolean validateUserName(Username userName) {


    }
*/
    public boolean isUsernameAvailableToRegister(String username) throws UnAvailableUsernameInputException {
     /*if (userName.getUserName().trim().length() > 0) {
            return true;
        }*/

        if (username.trim().length() > 0) {
            return true;
        }
        throw  new UnAvailableUsernameInputException("UNAVAILABLE USERNAME INPUT");
        //return false;
    }
}
