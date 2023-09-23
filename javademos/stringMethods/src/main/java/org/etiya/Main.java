package org.etiya;


public class Main {
    public static void main(String[] args) {
        //java 17-18
        String message="Merhaba Dünya ";
        String message2="  Merhaba Dünya   ";

        System.out.println(message);
        //Eleman sayısı
        System.out.println(message.length());
        //n.ci eleman 0dan
        System.out.println(message.charAt(4));
        //mesaj2 yi ekler.
        System.out.println(message.concat(" Java"));
        //ilk eleman "b" mi küçük-büyük harf duyarlı boolean deger döner
        System.out.println(message.startsWith("b"));
        //son elaman "b" mi küçük-büyük harf duyarlı boolean deger döner
        System.out.println(message.endsWith("a"));

        char[] characters =new char[3];
        message.getChars(0,3,characters,0);
        System.out.println(characters);

        System.out.println(message.indexOf("a")); //first
        System.out.println(message.lastIndexOf("a")); //end

        //boşlukları !ile değiştirir.
        System.out.println(message.replace("","!"));
        //haba 3 dahil 7 dahil değil.
        System.out.println(message.substring(3,7));

        System.out.println(message.toLowerCase()); //küçük
        System.out.println(message.toUpperCase()); //büyük
        System.out.println(message2.trim()); //baştaki ve sondaki boşlukları kaldırır


        for (String word : message.split(" ")){
            System.out.println(word);
            //split("") ayırır.
        }
    }
}