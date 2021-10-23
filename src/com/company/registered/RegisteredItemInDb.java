package com.company.registered;

import com.company.db.access.add.DAOAble;
import com.company.exception.ExitRequestException;
import com.company.secureinput.SecureInput;
import com.company.registered.subitem.RegisteredBook;
import com.company.registered.subitem.RegisteredMagazin;
import com.company.registered.subitem.RegisteredMateryal;
import com.company.registered.subitem.RegisteredUsers;

import java.util.List;

public class RegisteredItemInDb {

    DAOAble daoAble;
    SecureInput secureInput = new SecureInput();

    public RegisteredItemInDb(DAOAble daoAble) {
        this.daoAble = daoAble;
    }

    public void printItemByRequest() {

        System.out.println("Please enter NAME or NUMBER which is given below to see registered in Database ");
        String text = "1-) User\n" +
                "2-) Materyal\n" +
                "3-) Book\n" +
                "4-) Magazin\n";
        while (true) {
            System.out.println(text);
            try {
                String input = secureInput.getStringInput().trim();
                input = formatInputForSwitch(input);

                switch (input) {
                    case "User":
                    case "1":
                        printList(getUserListInDb());
                        break;
                    case "Materyal":
                    case "2":
                        printList(getMateryalListInDb());
                        break;
                    case "Book":
                    case "3":
                        printList(getBookListInDb());
                        break;
                    case "Magazin":
                    case "4":
                        printList(getMagazinListInDb());
                        break;
                    default:
                        System.out.println("Unknow Option Please try again");

                }


            } catch (ExitRequestException ex) {
//                e.printStackTrace();
                System.out.println(ex.getMessage());
                return;
            }
        }

    }

    private String formatInputForSwitch(String input) {
        if (checkEqualsIgnoreCase(input, "User"))
            return "User";

        if (checkEqualsIgnoreCase(input, "Materyal"))
            return "Materyal";
        if (checkEqualsIgnoreCase(input, "Book"))
            return "Book";
        if (checkEqualsIgnoreCase(input, "Magazin"))
            return "Magazin";

        return "null";

    }

    private boolean checkEqualsIgnoreCase(String text, String target) {
        if (text.equalsIgnoreCase(target))
            return true;
        return false;
    }


    private List getUserListInDb() {
        return new RegisteredUsers(daoAble).getList();

    }

    private List getMateryalListInDb() {
        return new RegisteredMateryal(daoAble).getList();

    }

    private List getBookListInDb() {
        return new RegisteredBook(daoAble).getList();

    }

    private List getMagazinListInDb() {
        return new RegisteredMagazin(daoAble).getList();

    }

    private void printList(List list) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        for (Object tmp : list) {
            System.out.println(tmp);
        }
        System.out.println("=========================================================");
    }
}
