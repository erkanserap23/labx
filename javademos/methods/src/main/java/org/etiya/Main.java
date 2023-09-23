package org.etiya;

public class Main {
    public static void main(String[] args) {

        System.out.println(totol(20,50));
        System.out.println(word("merHAbA DüNya"));
        find("abc");

        System.out.println(values(2,5,6));
        System.out.println(values());
        System.out.println( values(1));

    }

    public static  void find(String word){
        System.out.println("bulundu !!");
    }
    public  static  int totol(int number1, int number2){
        int result=number1+number2;
        // sonuç döner
        return result;
    }

    public static  String word(String message){
        String result= message.toUpperCase();
        return result;
    }


    //variable Arguments
    public  static  int values(int... numbers){
        int totalNumber=0;
        for (int number: numbers){
            totalNumber= totalNumber+number;
        }
        return totalNumber;
    }


}
