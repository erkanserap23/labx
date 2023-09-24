package oopWithNLayeredApp.business;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;


public class ProductManager {
    private  ProductDao productDao;
    private Logger[] loggers;
    // private Logger[] loggers;
    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }


    public void add(Product product) throws Exception {
        //iş kuralları
        if(product.getUnitPrice()<10){
            throw  new Exception("Ürün fiyatı 10dan küçüktür.");
        }
        productDao.add(product);
     // logerları çalıştıralım kaçtaneyse

        for(Logger logger:loggers){
            logger.log(product.getName());
        }


        //JdbcProductDao productDao= new JdbcProductDao();
        //productDao.add(product);




    }
}

// kural: bir katman başka bir katmanın sadece interface ini kullanmalı