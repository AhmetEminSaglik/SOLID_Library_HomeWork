package com.company.service.available.book;

import com.company.exception.UnAvailableBookNameInputException;

public class MagazinService {
    public boolean isDoiNumberAvailableToRegister(String doiNumber) throws UnAvailableBookNameInputException {

        if (doiNumber.trim().length() > 5) {
            return true;
        }
        throw new UnAvailableBookNameInputException("UNAVAILABLE DOI NUMBER INPUT  : Doi number must be bigger than 5 Interger Charater ");
    }
}
