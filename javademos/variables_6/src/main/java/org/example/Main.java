package org.example;

public class Main {
    public static void main(String[] args) {

        int number = 20;
        byte number2 = 127;
        float number3 = 3.14f;
        double number4 = 2.718;
        char value = 'A';
        boolean isActive = true;
        String text = "hello";

        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(value);
        System.out.println(text);
        System.out.println(isActive);

    }
}
        /*

      -!! Java'da değişkenlerin tanımlanması ve kullanılması için bazı kurallar vardır
               - Variable Name
                -Case Sensitivity:Java büyük ve küçük harf duyarlıdır
               - Reserved Keywords:Java'da özel anahtar kelimeler değişken adları olarak kullanılamaz.
                -Data Type:Bir değişkenin veri türü belirtilmelidir.
               - Initialization:Bir değişken tanımlandığında, başlatma değeri verilmezse, otomatik olarak varsayılan bir başlangıç değeri alır.
                -Scope :Değişkenlerin kapsamı, tanımlandıkları blok içinde sınırlıdır.
                -Final and Constants :Sabit değişkenlerdir ve bir kez başlatıldıktan sonra değeri değiştirilemez.

        -!! Data Types
        >> primitive Types
        --integer
        int (4 byte)    -2,147,483,648 ile 2,147,483,647
        byte (1 byte)   -128 ile 127
        short (2 byte)  -32,768 ile 32,767
        long (8 byte)   -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807
        --decimal number
        float (4 byte)   -3.4 x 10^38 ile 3.4 x 10^38
        double (8 byte)  -1.7 x 10^308 ile 1.7 x 10^308
        --character data type
        char (2 byte)   0 ile 65,535  *Unicode
        --logical data type
        boolean (1 byte) true false
        >>reference Types
        String, ArrayList ...
         */


