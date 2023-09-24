package oopWithNLayeredApp;
public class Main {
    public static void main(String[] args) {

         int number1=10;
         int number2=20;
         number1=number2;
         number2=100;
         System.out.println(number1);


         int[] numbers1=new int[] {1,2,9};
         int[] numbers2=new int[] {10,20,30};

         numbers1=numbers2;
         numbers2[0]=1000;
         System.out.println(numbers1[0]);


        }
    }
