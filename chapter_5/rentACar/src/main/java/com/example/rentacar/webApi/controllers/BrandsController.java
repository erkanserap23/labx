package com.example.rentacar.webApi.controllers;
import com.example.rentacar.business.abstracts.BrandService;
import com.example.rentacar.business.requests.CreateBrandRequest;
import com.example.rentacar.business.responses.GetAllBrandsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/brands")

public class BrandsController {

    private BrandService brandService;
    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

   @PostMapping("/add")
   @ResponseStatus(code= HttpStatus.CREATED)
    public  void add( @RequestBody()CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
   }

}
