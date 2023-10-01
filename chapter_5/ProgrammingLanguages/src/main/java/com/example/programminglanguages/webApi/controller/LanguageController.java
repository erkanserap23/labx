package com.example.programminglanguages.webApi.controller;

import com.example.programminglanguages.business.abstracts.LanguagesService;
import com.example.programminglanguages.business.requests.CreateLanguageRequest;
import com.example.programminglanguages.business.requests.UpdateLanguageRequest;
import com.example.programminglanguages.business.responses.GetAllLanguageResponse;
import com.example.programminglanguages.business.responses.GetByIdLanguageResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor

public class LanguageController {

    private LanguagesService languagesService;

    @GetMapping("/getAll")
    public List<GetAllLanguageResponse> getAll() {
        return languagesService.getAll();
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody() @Valid CreateLanguageRequest createLanguageRequest){
         languagesService.add(createLanguageRequest);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody  UpdateLanguageRequest updateLanguageRequest){
        languagesService.update(updateLanguageRequest);
    }

    @DeleteMapping("/{id}")
    public  void  delete (@PathVariable  int id){
        languagesService.delete(id);
    }

    @GetMapping("/{id}")
    public GetByIdLanguageResponse getById(@PathVariable int id) {
        return languagesService.getById(id);
    }

}
