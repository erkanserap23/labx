package org.etiya;

public class Main {
    public static void main(String[] args) {

        String student1 = "serap";
        String student2 = "murat";
        String student3 = "ayşe";
        String student4 = "taha";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("---------------");

        String[] arrays = new String[4];

        arrays[0] = "serap";
        arrays[1] = "murat";
        arrays[2] = "taha";
        arrays[3] = "ayşe";

        for (String array : arrays) {
            System.out.println(array);
        }

        System.out.println("---------------");

        String [][] cities=new String[3][3];
        cities[0][0]="Istanbul";
        cities[0][1]="Bursa";
        cities[0][2]="Bilecik";
        cities[1][0]="Ankara";
        cities[1][1]="Konya";
        cities[1][2]="Kayseri";
        cities[2][0]="Diyarbakır";
        cities[2][1]="Şanlıurfa";
        cities[2][2]="Gaziantep";

        for ( int i=0; i<3 ; i++){
            for( int j=0;j<3;j++){
                System.out.println(cities[i][j]);
            }
        }

    }
}