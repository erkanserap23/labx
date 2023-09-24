package org.etiya;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();

        product1.name = "Delonghi Kahve makinası";
        product1.unitPrice = 7500;
        product1.discount = 7;
        product1.unitsInStock = 3;
        product1.imageUrl = "eeff.jpg";

        System.out.println(product1.name);

        Product product2 = new Product();
        product2.name = "Smeg Kahve makinası";
        product2.unitPrice = 7500;
        product2.discount = 7;
        product2.unitsInStock = 3;
        product2.imageUrl = "eeff.jpg";

        System.out.println(product2.name);


        Product product3 = new Product();
        product3.name = "Kitchen Kahve makinası";
        product3.unitPrice = 7500;
        product3.discount = 7;
        product3.unitsInStock = 3;
        product3.imageUrl = "eeff.jpg";

        System.out.println(product3.name);
        System.out.println("-----------");

        Product[] products = {product1, product2, product3};


        for (Product product : products) {
            System.out.println(product.name);
        }
    }
}