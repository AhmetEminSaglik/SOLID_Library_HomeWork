package com.company.validation;

import com.company.db.DAOAble;
import com.company.entity.user.User;

public class Validation {
    DAOAble daoAblel;


    public Validation(DAOAble daoAblel) {
        this.daoAblel = daoAblel;
    }

    public boolean validateLoginProcess(User user) {
        ValidationLoginService validationLoginService = new ValidationLoginService(daoAblel);

            boolean validationSuccessfull = validationLoginService.validateLogin(user);
            if (validationSuccessfull == true) {
                return true;
            }


        return false;
    }
}
