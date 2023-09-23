package org.etiya;

public class Main {
    public static void main(String[] args) {
        //parametreli constructor
        Product product=new Product(1,"laptop");

        //boş constructor
        Product product2=new Product();
        product2.setId(1);
        product2.setName("hp lazer");

        ProductManagement productManagement =new ProductManagement();
        productManagement.demo(product);
        productManagement.demo(product2);

    }
}