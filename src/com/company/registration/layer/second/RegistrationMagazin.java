package com.company.registration.layer.second;

import com.company.db.DAOAble;
import com.company.entity.book.Book;
import com.company.entity.book.content.Author;
import com.company.entity.magazin.Magazin;
import com.company.exception.ExitRequestException;
import com.company.exception.UnAvailableBookNameInputException;
import com.company.registration.Registration;
import com.company.service.available.book.MagazinInputAvailableService;
import com.company.service.registration.db.MagazinRegistrationDB;

public class RegistrationMagazin extends Registration {


    public RegistrationMagazin(DAOAble<Magazin> daoAble) {
        super(daoAble);
    }

    public Magazin createMagazin() throws ExitRequestException {
        RegistrationBook registrationBook = new RegistrationBook(daoAble);
        Book book = registrationBook.createBook();
//        Book book = getMateryalRegistration().getBookRegistration().cre();
        int id = book.getId();
        String name = book.getName();
        String subject = book.getSubject();
        Author author = book.getAuthor();
        int pageNumber = book.getPageNumber();
        String doiNumber = getAvailableDoiNumber();

        Magazin magazin = new Magazin(id, name, author, subject, pageNumber, doiNumber);
        return magazin;
    }

    public void registerMagazin() throws ExitRequestException {
        Magazin magazin = createMagazin();
        registerMagazin(magazin);
//        return magazin;
    }

    private void registerMagazin(Magazin magazin) {
        MagazinRegistrationDB magazinRegistrationDB = new MagazinRegistrationDB(daoAble);
        magazinRegistrationDB.register(magazin);
    }

    public String getAvailableDoiNumber() throws ExitRequestException {
        try {
            String doiNumber = getMagazinDoiNumber();
//            exitRequestCheck(bookName);
            MagazinInputAvailableService.isDoiNumberAvailableToRegister(doiNumber);
            return doiNumber;
        } catch (UnAvailableBookNameInputException ex) {
            System.out.println(ex.getMessage());
            return getMagazinDoiNumber();
        }
    }

    private String getMagazinDoiNumber() throws ExitRequestException {
        System.out.print("Please enter for doi number : ");
        return secureInput.getStringInput();
    }


}
