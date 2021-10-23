package com.company.validation;

import com.company.db.access.add.DAOAble;
import com.company.entity.user.User;
import com.company.entity.user.content.Password;
import com.company.entity.user.content.Username;
import com.company.registered.subitem.RegisteredUsers;

import java.util.List;


public class ValidationLoginService {
    DAOAble daoAble;

    public ValidationLoginService(DAOAble daoAble) {
        this.daoAble = daoAble;
    }


    public boolean validateLogin(User user) {

        RegisteredUsers registeredUsers = new RegisteredUsers(daoAble);

        List<User> list = registeredUsers.getList();
        for (User tmp : list) {

            boolean usernameValidated = isUsernameMatched(user.getUserName(), tmp.getUserName());
            boolean passwordValidated = isPasswordMatched(user.getPassword(), tmp.getPassword());
            if (usernameValidated == true && passwordValidated == true)
                return true;
        }

        return false;

       /* ReadableDb<User> readableDb = new ReadingDb(daoAble);
        List<User> userList = (List<User>) readableDb.getAll();

        for (User tmp : userList) {
            System.out.println(tmp);
        }*/

    }

    boolean isUsernameMatched(Username usernameInput, Username usernameInDb) {
//        if (usernameInput == usernameInDb)
        if (isStringMatchSuccesFull(usernameInput.getName(), usernameInDb.getName()) == true)
            return true;
        return false;
    }

    boolean isPasswordMatched(Password passwordInput, Password passwordInDb) {
//        if (passwordInput == passwordInDb)
        if (isStringMatchSuccesFull(passwordInput.getPassword(), passwordInput.getPassword()) == true)
            return true;
        return false;
    }

    boolean isStringMatchSuccesFull(String firstParamater, String secondParamater) {
        if (firstParamater.equals(secondParamater)) return true;
        return false;


    }


}
