package com.example.rentacar.business.abstracts;

import com.example.rentacar.business.requests.CreateBrandRequest;
import com.example.rentacar.business.responses.GetAllBrandsResponse;
import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse>getAll();

    void add(CreateBrandRequest createBrandRequest );







}
