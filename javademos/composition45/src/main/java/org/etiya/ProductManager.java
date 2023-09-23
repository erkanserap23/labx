package org.etiya;

public class ProductManager {


    public static void add(Product product) {
        ProductValidator productValidator = new ProductValidator();
        if (productValidator.isValid(product)) {
            System.out.println("eklendi");
        } else {
            System.out.println("eklenemedi");
        }

    }
    public void  bişey(){

    };







}
