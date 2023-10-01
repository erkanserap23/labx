package com.example.programminglanguages.business.abstracts;

import com.example.programminglanguages.business.requests.CreateLanguageRequest;
import com.example.programminglanguages.business.requests.CreateTechnologyRequest;
import com.example.programminglanguages.business.requests.UpdateLanguageRequest;
import com.example.programminglanguages.business.requests.UpdateTechnologyRequest;
import com.example.programminglanguages.business.responses.GetAllLanguageResponse;
import com.example.programminglanguages.business.responses.GetAlllTechnologyResponse;
import com.example.programminglanguages.business.responses.GetByIdLanguageResponse;
import com.example.programminglanguages.business.responses.GetByIdTechnologyResponse;

import java.util.List;

public interface LanguagesService {
    List<GetAllLanguageResponse> getAll();
    void add(CreateLanguageRequest createLanguageRequest);
    void update(UpdateLanguageRequest updateLanguageRequest);
    void delete (int id);
    GetByIdLanguageResponse getById(int id);

}
