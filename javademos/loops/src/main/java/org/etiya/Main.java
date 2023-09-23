package org.etiya;

public class Main {
    public static void main(String[] args) {

        //for
        for (int i = 0; i < 10; i++) {
            System.out.println("for loop " + i);
        }

        int i = 5;

        //while
        while (i < 10) {
            System.out.println("while loop " + i);
            i++;
        }

        //do-while
        int n = 4;
        do {
            System.out.println("do-while loop " + n);
            n++;
        } while (n < 4);


        //for - each
        String[] names = {"Ali", "Ayşe", "Mehmet", "Zeynep"};
        for (String name : names) {
            System.out.println("name: " + name);
        }

    }
}

//*for
//*while (sayaç arttırılmalı yoksa sonsuz döngü)
//*do-while (en az bir kez çalışır en son kontrol eder )