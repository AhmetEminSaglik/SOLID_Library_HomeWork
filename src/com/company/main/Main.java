package com.company.main;

import com.company.db.DAOAble;
import com.company.db.variable.MYSQLDB;
import com.company.registration.Registration;

public class Main {

    /*
     * Kullanici adi sifre alinarak oturum acilacak (oturum ac)
     * Veritabaninda var olan kitap bilgileri cekilip gosterilecek. (BilgileriGetir(String))
     * Yeni kitap bilgisi olusturulacak( KitapOlustur(string))
     * Yeni dergi bilgisi olusturulacak (Dergi olustur(String))
     * Olusturulan bilgiler veritabanina kaydedilecek( Kaydet(String))
     *
     * OOp ve Single Res. Prensibleirne uygun tasatlariniz
     * Gerektiginde veritabani eklenebilmeli
     * Kitap bilgileri :id sayfasayisi kitap adi yazari konusu
     * Dergi bilgileri :id sayfasayisi kitap adi yazari konusu  doi numarasi */
    public static void main(String[] args) {
        // write your code here

        DAOAble daoAble = new MYSQLDB();

        Registration registration = new Registration(daoAble);
        registration.registerUserInWhileLoop();
//        registration.registerBookAsMuchAsWeWant();

       /* String userNameInput = "Ahmet Emin";
        String passwordInput = "myPass";

        boolean inputNameValidated = UsernameAvailableService.isUsernameAvailableToRegister(userNameInput);
        boolean inputPasswordValidated = PasswordAvailableService.isPasswordAvailableToRegister(passwordInput);

        if (inputNameValidated == true && inputPasswordValidated == true) {
            Username userName = new Username(userNameInput);
            Password password = new Password(passwordInput);

            User user = new User(userName, password);

            BaseRegistrationToDB registeration = new UserRegistarationDB(daoAble);
            registeration.register(user);

        } else {
            System.out.println("ERROR  : Username or password is not available to register please try again ");
        }
*/

    }
}
