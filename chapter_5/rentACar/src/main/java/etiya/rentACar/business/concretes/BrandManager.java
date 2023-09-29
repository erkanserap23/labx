package etiya.rentACar.business.concretes;

import etiya.rentACar.business.abstracts.BrandService;
import etiya.rentACar.dataAccess.abstracts.BrandDao;
import etiya.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {
    private BrandDao brandDao;
    @Autowired
    public BrandManager(BrandDao brandDao) {
        this.brandDao = brandDao;
    }
    @Override
    public List<Brand> getAll() {
        return brandDao.findAll();
    }
}
// Ioc
