package etiya.rentACar.dataAccess.abstracts;

import etiya.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BrandDao {
    List<Brand> getAll();
}

    //--Brand [] brands; array boyutu büyütülmesi sıkıntılı
