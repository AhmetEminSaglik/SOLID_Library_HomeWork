package com.company.registered;

import com.company.db.access.add.DAOAble;
import com.company.exception.ExitRequestException;
import com.company.registered.subitem.ReadRegisteredBook;
import com.company.secureinput.SecureInput;
import com.company.registered.subitem.ReadRegisteredMagazin;
import com.company.registered.subitem.ReadRegisteredMateryal;
import com.company.registered.subitem.ReadRegisteredUsers;

import java.util.List;

public class RegisteredItemInDb {

    DAOAble daoAble;
    SecureInput secureInput = new SecureInput();

    public RegisteredItemInDb(DAOAble daoAble) {
        this.daoAble = daoAble;
    }

    final String INPUT_USER_NUMBER = "1";
    final String INPUT_USER_STRING = "User";
    final String INPUT_MATERYAL_NUMBER = "2";
    final String INPUT_MATERYAL_STRING = "Materyal";
    final String INPUT_BOOK_NUMBER = "3";
    final String INPUT_BOOK_STRING = "Book";
    final String INPUT_MAGAZIN_NUMBER = "4";
    final String INPUT_MAGAZIN_STRING = "Magazin";

    public void printItemByRequest() {

        System.out.println("Please enter NAME or NUMBER which is given below to see registered in Database ");
        String text = INPUT_USER_NUMBER + "-) " + INPUT_USER_STRING + "\n" +
                INPUT_MATERYAL_NUMBER + "-) " + INPUT_MATERYAL_STRING + "\n" +
                INPUT_BOOK_NUMBER + "-) " + INPUT_BOOK_STRING + "\n" +
                INPUT_MAGAZIN_NUMBER + "-) " + INPUT_MAGAZIN_STRING + "\n";
        while (true) {
            System.out.println(text);
            try {
                String input = secureInput.getStringInput().trim();
                input = formatInputForSwitch(input);

                switch (input) {
                    case INPUT_USER_STRING:
                        printList(getUserListInDb());
                        break;
                    case INPUT_MATERYAL_STRING:
                        printList(getMateryalListInDb());
                        break;
                    case INPUT_BOOK_STRING:
                        printList(getBookListInDb());
                        break;
                    case INPUT_MAGAZIN_STRING:
                        printList(getMagazinListInDb());
                        break;
                    default:
                        System.out.println("Unknow Option Please try again >> (entered  invalid input) : " + input);

                }


            } catch (ExitRequestException ex) {
//                e.printStackTrace();
                System.out.println(ex.getMessage());
                return;
            }
        }

    }

    private String formatInputForSwitch(String input) {
        if (checkEqualsIgnoreCase(input, INPUT_USER_STRING) || input.equals(INPUT_USER_NUMBER))
            return INPUT_USER_STRING;

        if (checkEqualsIgnoreCase(input, INPUT_MATERYAL_STRING) || input.equals(INPUT_MATERYAL_NUMBER))
            return INPUT_MATERYAL_STRING;
        if (checkEqualsIgnoreCase(input, INPUT_BOOK_STRING) || input.equals(INPUT_BOOK_NUMBER))
            return INPUT_BOOK_STRING;
        if (checkEqualsIgnoreCase(input, INPUT_MAGAZIN_STRING) || input.equals(INPUT_MAGAZIN_NUMBER))
            return INPUT_MAGAZIN_STRING;

        return null;

    }

    private boolean checkEqualsIgnoreCase(String text, String target) {
        if (text.equalsIgnoreCase(target))
            return true;
        return false;
    }


    private List getUserListInDb() {
        return new ReadRegisteredUsers(daoAble).getList();

    }

    private List getMateryalListInDb() {
        return new ReadRegisteredMateryal(daoAble).getList();

    }

    private List getBookListInDb() {
        return new ReadRegisteredBook(daoAble).getList();

    }

    private List getMagazinListInDb() {
        return new ReadRegisteredMagazin(daoAble).getList();

    }

    private void printList(List list) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        for (Object tmp : list) {
            System.out.println(tmp);
        }
        System.out.println("=========================================================");
    }
}
