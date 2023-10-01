package com.example.rentacar;

import com.example.rentacar.core.utilities.exceptions.BusinessException;
import com.example.rentacar.core.utilities.exceptions.ProblemDetails;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@RestControllerAdvice
public class RentACarApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentACarApplication.class, args);
    }

    @Bean
    public ModelMapper getModelMapper(){
        return  new ModelMapper();
    }

    @ExceptionHandler
    @ResponseStatus(code= HttpStatus.BAD_REQUEST)
    public ProblemDetails handleBusinessException(BusinessException businessException){
        ProblemDetails problemDetails=new ProblemDetails();
        problemDetails.setMessage(businessException.getMessage());
                return problemDetails;
    }






}
