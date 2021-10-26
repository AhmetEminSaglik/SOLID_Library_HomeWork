package com.company.main;

import com.company.account.Account;
import com.company.db.access.add.DAOAble;
import com.company.db.variable.MYSQLDB;
import com.company.entity.Entity;
import com.company.exception.ExitRequestException;
import com.company.login.Login;
import com.company.registered.RegisteredItemInDb;
import com.company.registration.Registration;
import com.company.secureinput.SecureInput;

public class Main {

    /*
    OK    * Kullanici adi sifre alinarak oturum acilacak (oturum ac)
    OK    * Veritabaninda var olan kitap bilgileri cekilip gosterilecek. (BilgileriGetir(String))
    OK    * Yeni kitap bilgisi olusturulacak( KitapOlustur(string))
    OK    * Yeni dergi bilgisi olusturulacak (Dergi olustur(String))
    OK    * Olusturulan bilgiler veritabanina kaydedilecek( Kaydet(String))
     *
     * OOp ve Single Res. Prensibleirne uygun tasatlariniz
    OK    * Gerektiginde veritabani eklenebilmeli
    OK    * Kitap bilgileri :id sayfasayisi kitap adi yazari konusu
    Ok    * Dergi bilgileri :id sayfasayisi kitap adi yazari konusu  doi numarasi */
    public static void main(String[] args) throws ExitRequestException {

        DAOAble<Entity> daoAble = new MYSQLDB();

        Registration registration = new Registration(daoAble);



        registration.getUserRegistration().registerMultipleUser();

        registration.getMateryalRegistration().getBookRegistration().registerMultipleBook();
        registration.getMateryalRegistration().getMagazinRegistration().registerMultipleMagazin();

        SecureInput secureInput = new SecureInput();
        Login login = new Login(daoAble);
        Account account = login.loginToAccount();

        RegisteredItemInDb registeredItemInDb = new RegisteredItemInDb(daoAble);
        registeredItemInDb.printItemByRequest();

    }


}
