package com.example.rentacar.business.abstracts;

import com.example.rentacar.business.requests.CreateCarRequest;
import com.example.rentacar.business.requests.UpdateCarRequest;
import com.example.rentacar.business.responses.GetAllCarResponse;
import com.example.rentacar.business.responses.GetByIdCarResponse;

import java.util.List;

public interface CarService {
    void add(CreateCarRequest createCarRequest);
    List<GetAllCarResponse> getAll();
    void delete(int id);
    void update(UpdateCarRequest updateCarRequest);
    GetByIdCarResponse getById(int id);
}
