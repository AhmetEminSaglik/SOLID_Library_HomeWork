package com.company.registration.layer.second;

import com.company.db.access.add.DAOAble;
import com.company.entity.user.User;
import com.company.exception.ExitRequestException;
import com.company.exception.UnAvailablePasswordInputException;
import com.company.exception.UnAvailableUsernameInputException;
import com.company.entity.user.content.Password;
import com.company.entity.user.content.Username;
import com.company.registration.Registration;
import com.company.service.registration.UserRegistrationService;
import com.company.service.registration.db.UserRegistrationDB;
import com.company.service.available.user.PasswordAvailableService;
import com.company.service.available.user.UsernameAvailableService;

public class RegistrationUser extends Registration {
    //    DAOAble daoAble;
//    SecureInput secureInput = new SecureInput();

    public RegistrationUser(DAOAble daoAble) {
        super(daoAble);
//        this.daoAble = daoAble;
    }

    User createUser() throws ExitRequestException {
        String inputUsername, inputPassword;
        inputUsername = getAvailableUsername();
        inputPassword = getAvailablePassword();
        User user = createUserFromInputValues(inputUsername, inputPassword);
        return user;
    }

    public void registerUser() throws ExitRequestException {

        User user = createUser();
        registerUser(user);

//            System.out.println("IF you want to exit please  enter  :  \"exit\"");


        /*boolean usernameAvailable =*/
                /*inputUsername = getUsernameInput();
                UsernameAvailableService.isUsernameAvailableToRegister(inputUsername);*/




        /*boolean passwordAvailable =*/


                /*inputPassword = getPasswordInput();
                PasswordAvailableService.isPasswordAvailableToRegister(inputPassword);*/


        // once object olarak user gonderecez  --> BaseRegistrationToDB
        // sonra user olarak user  gondericez  --> BaseRegistrationToDB<User>

//return user;
    }

    /*private boolean exitRequestCheck(String input) throws ExitRequestException {
        if (input.equalsIgnoreCase("exit")) {
            throw new ExitRequestException("Exit request");
        }
        return false;
    }*/

    private String getAvailableUsername() throws ExitRequestException {
        try {
            String inputUsername = getUsernameInput();
            //exitRequestCheck(inputUsername);
            UsernameAvailableService.isUsernameAvailableToRegister(inputUsername);
            return inputUsername;
        } catch (UnAvailableUsernameInputException ex) {
            System.out.println(ex.getMessage());
            return getAvailableUsername();
        }

    }

    private String getAvailablePassword() throws ExitRequestException {
        try {
            String inputPassword = getPasswordInput();
//            exitRequestCheck(inputPassword);
            PasswordAvailableService.isPasswordAvailableToRegister(inputPassword);
            return inputPassword;
        } catch (UnAvailablePasswordInputException ex) {
            System.out.println(ex.getMessage());
            return getAvailablePassword();
        }

    }


    User createUserFromInputValues(String inputUsername, String inputPassword) {

        Username username = new Username(inputUsername);
        Password password = new Password(inputPassword);
        return new User(username, password);
    }

    private void registerUser(User user) {

//        UserRegistrationDB userRegistration = new UserRegistrationDB(daoAble);
//        userRegistration.register(user);
        UserRegistrationService userRegistrationService= new UserRegistrationService(daoAble);
        userRegistrationService.registerUser(user);
    }

    private String getUsernameInput() throws ExitRequestException {
        System.out.print("Please enter for Username : ");
        return secureInput.getStringInput();

    }

    private String getPasswordInput() throws ExitRequestException {
        System.out.print("Please enter for Password : ");
        return secureInput.getStringInput();

    }


}
