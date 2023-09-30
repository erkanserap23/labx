package com.example.rentacar.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetByIdBrandResponse {
    private int id;
    private  String name;
}
