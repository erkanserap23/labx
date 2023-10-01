package com.example.rentacar.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
    @NonNull
    @NotBlank
    @Size(min=3,max=20)
    private  String name;
}
