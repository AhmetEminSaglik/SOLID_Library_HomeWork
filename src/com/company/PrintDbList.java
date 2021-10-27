package com.company;

import java.util.List;

public class PrintDbList {
    public static void printList(List list) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        for (Object tmp : list) {
            System.out.println(tmp);
        }
        System.out.println("=========================================================");
    }

}
