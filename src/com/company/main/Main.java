package com.company.main;

import com.company.db.DAOAble;
import com.company.db.variable.MSSQLDB;
import com.company.exception.ExitRequestException;
import com.company.registration.Registration;
import com.company.secureinput.SecureInput;

public class Main {

    /*
    OK   * Kullanici adi sifre alinarak oturum acilacak (oturum ac)
     * Veritabaninda var olan kitap bilgileri cekilip gosterilecek. (BilgileriGetir(String))
    OK    * Yeni kitap bilgisi olusturulacak( KitapOlustur(string))
     * Yeni dergi bilgisi olusturulacak (Dergi olustur(String))
    OK    * Olusturulan bilgiler veritabanina kaydedilecek( Kaydet(String))
     *
     * OOp ve Single Res. Prensibleirne uygun tasatlariniz
    OK    * Gerektiginde veritabani eklenebilmeli
    OK    * Kitap bilgileri :id sayfasayisi kitap adi yazari konusu
     * Dergi bilgileri :id sayfasayisi kitap adi yazari konusu  doi numarasi */
    public static void main(String[] args) throws ExitRequestException {

        DAOAble daoAble = new MSSQLDB();

        Registration registration = new Registration(daoAble);


        registration.getUserRegistration().registerMultipleUser();

        registration.getMateryalRegistration().registerMultipleBook();

        SecureInput secureInput = new SecureInput();
        /*System.out.println("enter username to login");
        String username = secureInput.getStringInput();
        System.out.println("enter password to login");
        String password = secureInput.getStringInput();*/
        Login login = new Login(daoAble);
        login.loginToAccount();

//        new Validation(daoAble).validateLoginProcess(new User(new Username(username), new Password(password)));

    }
}
