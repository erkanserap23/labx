package com.example.programminglanguages.business.concretes;

import com.example.programminglanguages.business.abstracts.LanguagesService;
import com.example.programminglanguages.business.requests.CreateLanguageRequest;
import com.example.programminglanguages.business.requests.UpdateLanguageRequest;
import com.example.programminglanguages.business.responses.GetAllLanguageResponse;
import com.example.programminglanguages.business.responses.GetByIdLanguageResponse;
import com.example.programminglanguages.core.utilities.mappers.ModelMapperService;
import com.example.programminglanguages.dataAccess.abstracts.LanguagesRepository;
import com.example.programminglanguages.entities.concretes.Languages;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class LanguageManager implements LanguagesService {

    LanguagesRepository languagesRepository;
    ModelMapperService modelMapperService;

    @Override
    public List<GetAllLanguageResponse> getAll() {
        List<Languages> languagesList = languagesRepository.findAll();

        List<GetAllLanguageResponse> languageResponses = languagesList.stream()
                .map(languages -> this.modelMapperService.forResponse()
                        .map(languages, GetAllLanguageResponse.class)).collect(Collectors.toList());
        return languageResponses;

    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {

        Languages languages = this.modelMapperService.forRequest().map(createLanguageRequest, Languages.class);
        languagesRepository.save(languages);

    }

    @Override
    public void update(UpdateLanguageRequest updateLanguageRequest) {
        Languages languages = this.modelMapperService.forRequest().map(updateLanguageRequest, Languages.class);
        languagesRepository.save(languages);
    }

    @Override
    public void delete(int id) {
        this.languagesRepository.deleteById(id);
    }

    @Override
    public GetByIdLanguageResponse getById(int id) {
        Languages languages = this.languagesRepository.findById(id).orElseThrow();
        GetByIdLanguageResponse response = this.modelMapperService.forResponse()
                .map(languages, GetByIdLanguageResponse.class);
        return response;
    }
}
