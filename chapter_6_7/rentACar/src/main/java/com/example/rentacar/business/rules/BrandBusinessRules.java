package com.example.rentacar.business.rules;

import com.example.rentacar.core.utilities.exceptions.BusinessException;
import com.example.rentacar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
    private BrandRepository brandRepository;
    public void checkIfBrandNameExists(String name){
        if(this.brandRepository.existsByName(name)){
            throw new BusinessException("Brand already exists");
        }

    }
}


//static yapmamıza gerek yok !!
//java exception types
// throw new RuntimeException("Brand already exists");
// trow new Exception ...