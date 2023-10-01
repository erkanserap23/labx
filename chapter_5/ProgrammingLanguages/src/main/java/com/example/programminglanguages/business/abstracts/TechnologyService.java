package com.example.programminglanguages.business.abstracts;

import com.example.programminglanguages.business.requests.CreateTechnologyRequest;
import com.example.programminglanguages.business.requests.UpdateTechnologyRequest;
import com.example.programminglanguages.business.responses.GetAllTechnologyResponse;
import com.example.programminglanguages.business.responses.GetByIdTechnologyResponse;

import java.util.List;

public interface TechnologyService {

     List<GetAllTechnologyResponse> getAll();
     void add(CreateTechnologyRequest createTechnologyRequest);
     void update(UpdateTechnologyRequest updateTechnologyRequest);
     void delete (int id);
     GetByIdTechnologyResponse getById(int id);

}
