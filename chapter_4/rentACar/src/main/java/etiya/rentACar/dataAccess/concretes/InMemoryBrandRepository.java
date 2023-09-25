package etiya.rentACar.dataAccess.concretes;

import etiya.rentACar.dataAccess.abstracts.BrandDao;
import etiya.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //bu sınıf bir bussnes nesnesidir
public class InMemoryBrandRepository implements BrandDao {

  List<Brand>brands;

    public InMemoryBrandRepository() {
        brands=new ArrayList<Brand>();
        brands.add(new Brand(1,"bmv"));
        brands.add(new Brand(2,"mercedes"));
        brands.add(new Brand(3,"Audi"));
        brands.add(new Brand(4,"Togg"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
