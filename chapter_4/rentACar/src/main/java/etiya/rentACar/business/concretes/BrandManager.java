package etiya.rentACar.business.concretes;

import etiya.rentACar.business.abstracts.BrandService;
import etiya.rentACar.dataAccess.abstracts.BrandDao;
import etiya.rentACar.entities.concretes.Brand;

import java.util.List;

public class BrandManager implements BrandService {
    private  BrandDao brandDao;
    public BrandManager(BrandDao brandDao) {
        this.brandDao = brandDao;
    }





    @Override
    public List<Brand> getAll() {
        return brandDao.getAll();
    }
}
