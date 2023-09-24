package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao {
    public  void add(Product product){
        //sadece ve sadece db erişim kodları buraya yazılır..
        System.out.println("jdbs ile veri tabanına eklendi");
    }
}

//Dao data access objesi