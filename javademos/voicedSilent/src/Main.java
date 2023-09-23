import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sesli bir harf giriniz ..!");

        Scanner scanner = new Scanner(System.in);
        char letter;
        letter = scanner.next().charAt(0);

        switch(letter){
            case 'a':
            case 'o':
            case 'ı':
            case 'u':
                System.out.println("kalın sesli harf");
                break;

            case 'e':
            case 'ö':
            case 'i':
            case 'ü':
                System.out.println("ince sesli harf");
                break;
            default:
                System.out.println("sesli harf giriniz");

        }

    }
}