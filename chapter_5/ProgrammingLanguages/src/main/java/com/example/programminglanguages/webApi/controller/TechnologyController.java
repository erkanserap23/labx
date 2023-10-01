package com.example.programminglanguages.webApi.controller;
import com.example.programminglanguages.business.abstracts.TechnologyService;
import com.example.programminglanguages.business.requests.CreateTechnologyRequest;
import com.example.programminglanguages.business.requests.UpdateTechnologyRequest;
import com.example.programminglanguages.business.responses.GetAllTechnologyResponse;
import com.example.programminglanguages.business.responses.GetByIdTechnologyResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
@AllArgsConstructor
public class TechnologyController {

    TechnologyService technologyService;
    @GetMapping("/getAll")
    public List<GetAllTechnologyResponse>getAll(){
        return technologyService.getAll();
    }
    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid CreateTechnologyRequest createTechnologyRequest){
        technologyService.add(createTechnologyRequest);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody UpdateTechnologyRequest updateTechnologyRequest){
       technologyService.update(updateTechnologyRequest);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable  int id){
       technologyService.delete(id);
    }

    @GetMapping("/{id}")
    public GetByIdTechnologyResponse getById(@PathVariable int id) {
        return technologyService.getById(id);
    }



}
