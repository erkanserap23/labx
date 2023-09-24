package org.etiya;


public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();

        product1.setName("Delonghi Kahve makinası");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("eeff.jpg");

        System.out.println(product1.getName());

        Product product2 = new Product();
        product2.setName("Semg Kahve makinası");
        product2.setUnitPrice(7500);
        product2.setDiscount(7);
        product2.setUnitsInStock(3);
        product2.setImageUrl("eeff.jpg");

        System.out.println(product2.getName());


        Product product3 = new Product();
        product3.setName("Kitchen Kahve makinası");
        product3.setUnitPrice(7500);
        product3.setDiscount(7);
        product3.setUnitsInStock(3);
        product3.setImageUrl("eeff.jpg");

        System.out.println(product3.getName());
        System.out.println("-----------");

        Product[] products = {product1, product2, product3};


        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
}

