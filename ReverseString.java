package com.company;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inputString;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        inputString = scanner.nextLine();
        scanner.close();

        String reverseString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverseString += inputString.substring(i, i + 1);
        }
        System.out.println("Строка в обратном порядке: " + reverseString);
    }
}
