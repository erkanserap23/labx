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
    }
}