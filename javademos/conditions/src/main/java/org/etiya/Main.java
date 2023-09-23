package org.etiya;

public class Main {
    public static void main(String[] args) {

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


        //-------
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

