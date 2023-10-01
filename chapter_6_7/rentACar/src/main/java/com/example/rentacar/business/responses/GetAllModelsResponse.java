package com.example.rentacar.business.responses;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllModelsResponse {
    private int id;
    private String name;
    private String brandName;
}
