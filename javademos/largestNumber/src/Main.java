
public class Main {
    public static void main(String[] args) {

        int sayi1=25;
        int sayi2=30;
        int sayi3=50;

        int largestNumber=sayi1;


        if (largestNumber<sayi2){
            largestNumber=sayi2;

        }
        if (largestNumber<sayi3){
            largestNumber=sayi3;
        }

        System.out.println("largestNumber" +" "+largestNumber);
    }
}