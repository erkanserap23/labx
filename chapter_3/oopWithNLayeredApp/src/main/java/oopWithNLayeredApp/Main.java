package oopWithNLayeredApp;


import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1, "IPhone Xr", 20);
        ProductManager productManager = new ProductManager(new JdbcProductDao());
        productManager.add(product1);


    }
}
