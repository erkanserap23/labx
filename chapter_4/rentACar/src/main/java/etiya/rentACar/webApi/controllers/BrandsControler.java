package etiya.rentACar.webApi.controllers;

import ch.qos.logback.core.model.INamedModel;
import etiya.rentACar.business.abstracts.BrandService;
import etiya.rentACar.business.concretes.BrandManager;
import etiya.rentACar.dataAccess.concretes.InMemoryBrandRepository;
import etiya.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController //annotation
@RequestMapping("/api/brans")
public class BrandsControler {
    private BrandService brandService;

    @Autowired
    public BrandsControler(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<Brand> getAll(){
       // BrandManager brandManager=new BrandManager(new InMemoryBrandRepository());
        return  brandService.getAll();
    }


}

// api de isimlendirmelerde s ekiyle  çogul kullanılır.
// rest-full control için

 // @RestController  anatasyon bilgilendirme derleyiçi çalıştıgında
 // @RequestMapping("/api/brans") controle erişme
 // Ioc
// @Autowired kim brans sevisi impleme ediyor bul