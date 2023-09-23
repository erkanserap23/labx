package org.etiya;

public abstract  class GameCalculator {

    public abstract void calculator();
    public final void gameOver(){
        System.out.println("Game over ...!");
    };
}

/*
   !final ezilemez yani overriding edilemez
   **** abstract classlar
   -Soyut metotlar sadece imza (parametreler ve dönüş türü) ile tanımlanır,
   -new lenemez new lenebilmesi için ezilmeli tercih edilmez.
   -zorunlu yazılmalıdır
   -gövdesiz methodlardır
   -abstract method varsa classda abstract olmalı.


 */