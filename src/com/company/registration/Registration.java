package com.company.registration;

import com.company.db.access.add.DAOAble;
import com.company.registration.layer.first.RegistrationOfMateryal;
import com.company.registration.layer.first.RegistrationOfUser;
import com.company.secureinput.SecureInput;

public class Registration {
    protected DAOAble daoAble;
    protected SecureInput secureInput = new SecureInput();

    public Registration(DAOAble daoAble) {
        this.daoAble = daoAble;
    }

    public RegistrationOfUser getUserRegistration() {
        System.out.println(daoAble);
        return new RegistrationOfUser(daoAble);
    }

    public RegistrationOfMateryal getMateryalRegistration() {

        return new RegistrationOfMateryal(daoAble);
    }


}
