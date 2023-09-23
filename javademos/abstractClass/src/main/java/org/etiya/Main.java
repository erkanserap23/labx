package org.etiya;


public class Main {
    public static void main(String[] args) {

//         ! tercih edilmez
//         GameCalculator gameCalculator =new GameCalculator() {
//             @Override
//             public void calculator() {
//
//             }
//         }

        GameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.calculator();

    }


}