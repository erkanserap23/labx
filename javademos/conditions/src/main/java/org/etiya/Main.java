package org.etiya;

public class Main {
    public static void main(String[] args) {

        //if-else (Conditions):

        int number = 24;
        if (number < 20) {
            System.out.println("The number is less than 20.");
        } else if (number == 20) {
            System.out.println("The number is equal to 20");
        } else if (number > 100) {
            System.out.println("The number is greater than 10");
        } else {
            System.out.println("else");
            //code to be executed if the condition is not met or is false
        }


        //switch-case (Conditions):
        char grade = 'c';

        switch (grade) {
            case 'a':
                System.out.println("Successful a");
                break;
            case 'b':
                System.out.println("Successful b");
                break;
            case 'c':
                System.out.println("Successful c");
                break;
            case 'd':
                System.out.println("Failed d");
                break;
            default:
                System.out.println("error message");


                //Ternary Operatörü
                int puan = 75;
                String sonuc = (puan >= 50) ? "Geçti" : "Kaldı";
                System.out.println(sonuc);

        }
    }
}


   /*
   -->Conditions:
   -if-else
   -switch-case
   -ternary

   ***> Equality Comparison Operator:
   *Equality Operator ==
   *Inequality Operator !=
   *Greater Than Operator >
   *Less Than Operator <
   *Greater Than or Equal To Operator >=
   *Less Than or Equal To Operator <=
   */

