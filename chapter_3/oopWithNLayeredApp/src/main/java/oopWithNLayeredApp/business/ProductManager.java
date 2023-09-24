package oopWithNLayeredApp.business;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;


public class ProductManager {
    private  ProductDao productDao;
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }


    public void add(Product product) throws Exception {
        //iş kuralları
        if(product.getUnitPrice()<10){
            throw  new Exception("Ürün fiyatı 10dan küçüktür.");
        }
        productDao.add(product);

        //JdbcProductDao productDao= new JdbcProductDao();
        //productDao.add(product);




    }
}

// kural: bir katman başka bir katmanın sadece interface ini kullanmalı