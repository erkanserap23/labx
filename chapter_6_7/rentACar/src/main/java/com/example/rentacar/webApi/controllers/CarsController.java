package com.example.rentacar.webApi.controllers;

import com.example.rentacar.business.abstracts.CarService;
import com.example.rentacar.business.requests.CreateCarRequest;
import com.example.rentacar.business.requests.UpdateCarRequest;
import com.example.rentacar.business.responses.GetAllCarResponse;
import com.example.rentacar.business.responses.GetByIdCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarsController {
     private CarService carService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateCarRequest createCarRequest) {
        this.carService.add(createCarRequest);
    }

    @GetMapping("/getAll")
    List<GetAllCarResponse> getAll() {
        return this.carService.getAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.carService.delete(id);
    }

    @PutMapping
    public void update(UpdateCarRequest updateCarRequest) {
        this.carService.update(updateCarRequest);
    }

    @GetMapping({"{id}"})
    public GetByIdCarResponse getById(int id) {
        return this.carService.getById(id);
    }
}
