package org.etiya;


public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setId(7);
        product.setName("laptop");
        product.setPrice(5000);
        product.setStockAmount(true);
        product.setDescription("ddfd");


        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println(product.getCode());


    }
}