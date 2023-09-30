package com.example.rentacarx.business.abstracts;

import com.example.rentacarx.business.requests.CreateBrandRequest;
import com.example.rentacarx.business.responses.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {
   List<GetAllBrandsResponse>getAll();
   void add(CreateBrandRequest createBrandRequest);



}
