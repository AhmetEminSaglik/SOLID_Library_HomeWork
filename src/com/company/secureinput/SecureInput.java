package com.company.secureinput;

import java.util.Scanner;

public class SecureInput {
    Scanner scanner = new Scanner(System.in);

    public String getStringInput() {
        return scanner.nextLine();
    }


}
