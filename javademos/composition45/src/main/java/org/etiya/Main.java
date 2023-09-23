package org.etiya;

public class Main {
    public static void main(String[] args) {


        ProductManager manager =new ProductManager();

        Product product =new Product();
        product.price=10;
        product.name="";
        manager.add(product);



    }
}

// static newlemeye gerek yoktur
// statick birkere çalışır
//stack de bellekten atılmaz durdurana kadar
// consturactor yapıcı blocklar newlendiğinde çalışır
//parametresiz ise
//static{
//  static çalışınca çalışır
// }