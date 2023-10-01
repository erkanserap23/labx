package com.example.rentacar.webApi.controllers;

import com.example.rentacar.business.abstracts.ModelService;
import com.example.rentacar.business.requests.CreateModelRequest;
import com.example.rentacar.business.responses.GetAllModelsResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/models")
@AllArgsConstructor
public class ModelController {

   private ModelService modelService;

    @GetMapping()
    public List<GetAllModelsResponse> getAll(){
        return modelService.getAll();
    }
    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public  void add(@RequestBody()  @Valid()CreateModelRequest createModelRequest){
        this.modelService.add(createModelRequest);
    }


}
