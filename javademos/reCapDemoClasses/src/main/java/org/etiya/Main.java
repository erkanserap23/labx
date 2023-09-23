package org.etiya;


public class Main {
    public static void main(String[] args) {

      Calculator calculator =new Calculator();
     int result1= calculator.multiplication(2,5);
        int result2= calculator.total(2,5);
        int result3=calculator.subtraction(2,5);
        System.out.println("çarpma :"+result1 +" toplama :"+result2+ " çıkarma :"+result3);

    }
}