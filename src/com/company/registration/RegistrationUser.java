package com.company.registration;

import com.company.db.DAOAble;
import com.company.entity.user.User;
import com.company.exception.ExitRequestException;
import com.company.exception.UnAvailablePasswordInputException;
import com.company.exception.UnAvailableUsernameInputException;
import com.company.entity.user.content.Password;
import com.company.entity.user.content.Username;
import com.company.service.registration.db.BaseRegistrationToDB;
import com.company.service.registration.db.UserRegistarationDB;
import com.company.service.validation.user.PasswordAvailableService;
import com.company.service.validation.user.UsernameAvailableService;

public class RegistrationUser extends Registration {
    //    DAOAble daoAble;
//    SecureInput secureInput = new SecureInput();

    public RegistrationUser(DAOAble daoAble) {
        super(daoAble);
//        this.daoAble = daoAble;
    }

    public void registerUser() throws ExitRequestException {

        String inputUsername, inputPassword;

//            System.out.println("IF you want to exit please  enter  :  \"exit\"");


            /*boolean usernameAvailable =*/
                /*inputUsername = getUsernameInput();
                UsernameAvailableService.isUsernameAvailableToRegister(inputUsername);*/


                inputUsername = getAvailableUsername();

                /*boolean passwordAvailable =*/

                inputPassword = getAvailablePassword();
                /*inputPassword = getPasswordInput();
                PasswordAvailableService.isPasswordAvailableToRegister(inputPassword);*/


                User user = createUserFromInputValues(inputUsername, inputPassword);

                registerUser(user);

              // once object olarak user gonderecez  --> BaseRegistrationToDB
            // sonra user olarak user  gondericez  --> BaseRegistrationToDB<User>




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

        BaseRegistrationToDB userRegistration = new UserRegistarationDB(daoAble);
        userRegistration.register(user);
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
