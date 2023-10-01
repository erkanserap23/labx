package com.example.rentacar.business.abstracts;

import com.example.rentacar.business.requests.CreateBrandColorRequest;
import com.example.rentacar.business.requests.UpdateBrandColorRequest;
import com.example.rentacar.business.responses.GetAllBrandColorResponse;
import com.example.rentacar.business.responses.GetByIdBrandColorResponse;


import java.util.List;

public interface BrandColorService {
    List<GetAllBrandColorResponse> getAll();
    void add(CreateBrandColorRequest createBrandColorRequest);
    void update(UpdateBrandColorRequest updateBrandColorRequest);
    void delete(int id);

   GetByIdBrandColorResponse getById(int id);

}
