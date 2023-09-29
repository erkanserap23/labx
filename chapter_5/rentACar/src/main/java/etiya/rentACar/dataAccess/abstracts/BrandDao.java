package etiya.rentACar.dataAccess.abstracts;

import etiya.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandDao extends JpaRepository<Brand,Integer>{


}
    //List<Brand> getAll();
    //--Brand [] brands; array boyutu büyütülmesi sıkıntılı
    //NationalId
