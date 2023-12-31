package com.example.rentacar.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {

    private String name;
    private int brandId;
}


//@NonNull boş olamaz
//@NotBlank aralarında boşluk olmasın