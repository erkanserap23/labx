package com.example.programminglanguages.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateLanguageRequest {
     @NonNull
     @NotBlank
     @Size(min=2,max=20)

     private String name;
}
