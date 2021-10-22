package com.company.service.available.book;

import com.company.exception.UnAvailableBookNameInputException;

public class MagazinInputAvailableService {
    public static boolean isDoiNumberAvailableToRegister(String doiNumber) throws UnAvailableBookNameInputException {
        new MagazinService().isDoiNumberAvailableToRegister(doiNumber);
        return true;
    }
}
