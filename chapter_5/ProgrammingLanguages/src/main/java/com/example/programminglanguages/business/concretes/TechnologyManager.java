package com.example.programminglanguages.business.concretes;

import com.example.programminglanguages.business.abstracts.TechnologyService;
import com.example.programminglanguages.business.requests.CreateTechnologyRequest;
import com.example.programminglanguages.business.requests.UpdateTechnologyRequest;
import com.example.programminglanguages.business.responses.GetAllLanguageResponse;
import com.example.programminglanguages.business.responses.GetAllTechnologyResponse;
import com.example.programminglanguages.business.responses.GetByIdLanguageResponse;
import com.example.programminglanguages.business.responses.GetByIdTechnologyResponse;
import com.example.programminglanguages.core.utilities.mappers.ModelMapperService;
import com.example.programminglanguages.dataAccess.abstracts.TechnologyRepository;
import com.example.programminglanguages.entities.concretes.Languages;
import com.example.programminglanguages.entities.concretes.Technology;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TechnologyManager implements TechnologyService {

    private ModelMapperService modelMapperService;
    private TechnologyRepository technologyRepository;

    @Override
    public List<GetAllTechnologyResponse> getAll() {
        List<Technology> technologyList =technologyRepository.findAll();

        List<GetAllTechnologyResponse> technologyResponses = technologyList.stream()
                .map(technology-> this.modelMapperService.forResponse()
                        .map(technology, GetAllTechnologyResponse.class)).collect(Collectors.toList());
        return technologyResponses;

    }

    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {
     Technology technology= modelMapperService.forResponse().map(createTechnologyRequest,Technology.class);
    technologyRepository.save(technology);

    }

    @Override
    public void update(UpdateTechnologyRequest updateTechnologyRequest) {
        Technology technology= modelMapperService.forResponse().map(updateTechnologyRequest,Technology.class);
        technologyRepository.save(technology);
    }

    @Override
    public void delete(int id) {
        this.technologyRepository.deleteById(id);
    }

    @Override
    public GetByIdTechnologyResponse getById(int id) {

        Technology technology= this.technologyRepository.findById(id).orElseThrow();
        GetByIdTechnologyResponse response = this.modelMapperService.forResponse()
        .map(technology, GetByIdTechnologyResponse.class);
        return response;
    }
}
