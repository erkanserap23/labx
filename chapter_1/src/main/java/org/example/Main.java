package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        String middleText = "It may interest you";
        String text = "Term time";

        System.out.println(middleText);
        int maturity = 12;
        double dollarYesterday = 18.14;
        double dollarToday = 18.10;

        String arrowDirection = "";
        if (dollarToday < dollarYesterday) {
            arrowDirection = "down.svg";
            System.out.println(arrowDirection);
        } else if (dollarToday > dollarYesterday) {
            arrowDirection = "up.svg";
            System.out.println(arrowDirection);
        } else {
            arrowDirection = ("equal.svg");
            System.out.println(arrowDirection);
        }

        //array
        String[] credit = {"halk bank", "vakıf bank", "..."};
        System.out.println(credit[0]);
        System.out.println(credit[1]);
        System.out.println(credit[2]);

        for (int i = 0; i < credit.length; i++) {
            System.out.println(credit[i]);
        }


    }
}