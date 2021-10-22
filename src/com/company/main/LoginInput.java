package com.company.main;

import com.company.entity.user.User;
import com.company.entity.user.content.Password;
import com.company.entity.user.content.Username;
import com.company.exception.ExitRequestException;
import com.company.secureinput.SecureInput;

public class LoginInput {
    SecureInput secureInput = new SecureInput();

    /*public void login() {
        User user = getUserInput();

        if (user == null) {
            System.out.println("Login Request is canceled");
        } else {
            Login loginClass = new Login();
            loginClass.login(user);
        }

    }*/

    public User getUserLoginInput() {
        try {
            System.out.println("LOGIN : Enter username ");
            String usernameInput = secureInput.getStringInput();
            System.out.println("LOGIN : Enter pasword");
            String passwrodInput = secureInput.getStringInput();
            Username username = new Username(usernameInput);
            Password password = new Password(passwrodInput);
            return new User(username, password);
        } catch (ExitRequestException e) {
            return null;
        }

    }
}
