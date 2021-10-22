package com.company.secureinput;

import com.company.exception.ExitRequestException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecureInput {
    Scanner scanner = new Scanner(System.in);

    public String getStringInput() throws ExitRequestException {

        String inputText = scanner.nextLine();

        exitRequestCheck(inputText);

        return inputText;
    }

    public int getPozitiveInput() throws ExitRequestException {

        try {
            String inputText = getStringInput();

            return Integer.parseInt(inputText);

        } catch (InputMismatchException | NumberFormatException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Please enter Integer number");
            return getPozitiveInput();
        }

    }

    private void exitRequestCheck(String input) throws ExitRequestException {
        if (input.equalsIgnoreCase("exit")) {
            throw new ExitRequestException("Exit request");
        }

    }


}
