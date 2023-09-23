import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number ...");
        Scanner scanner=new Scanner(System.in);
        int value= scanner.nextInt();

        int[] myNumbers={1,2,3,4,5,8,11,46,49,56};
        boolean isActive=false;

        for(int number:myNumbers){

            if(number == value){
               isActive=true;
               break;
            }
            else {
                isActive = false;
            }
        }
        if(isActive){
            System.out.println("Number Found :) ");
        }
        else {
            System.out.println("Number  Not Found :) ");
        }
    }
}