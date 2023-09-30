package com.example.rentacarx.business.concretes;

import com.example.rentacarx.business.abstracts.BrandService;
import com.example.rentacarx.business.requests.CreateBrandRequest;
import com.example.rentacarx.business.responses.GetAllBrandsResponse;
import com.example.rentacarx.core.untilities.mappers.ModelMapperService;
import com.example.rentacarx.dataAccess.abstracts.BrandRepository;
import com.example.rentacarx.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class BrandManager implements BrandService {

   private BrandRepository brandRepository;
    private  ModelMapperService modelMapperService;

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand>brands=brandRepository.findAll();
        List<GetAllBrandsResponse>ResponsesItem=brands.stream()
        .map(brand -> this.modelMapperService.forResponse()
        .map(brand,GetAllBrandsResponse.class)).collect(Collectors.toList());
         return  ResponsesItem;

    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

    }
}
