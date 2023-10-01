package com.example.programminglanguages.business.abstracts;

import com.example.programminglanguages.business.requests.CreateLanguageRequest;
import com.example.programminglanguages.business.requests.UpdateLanguageRequest;
import com.example.programminglanguages.business.responses.GetAllLanguageResponse;
import com.example.programminglanguages.business.responses.GetByIdLanguageResponse;

import java.util.List;

public interface LanguagesService {
    List<GetAllLanguageResponse> getAll();
    void add(CreateLanguageRequest createLanguageRequest);
    void update(UpdateLanguageRequest updateLanguageRequest);
    void delete (int id);
    GetByIdLanguageResponse getById(int id);

}
