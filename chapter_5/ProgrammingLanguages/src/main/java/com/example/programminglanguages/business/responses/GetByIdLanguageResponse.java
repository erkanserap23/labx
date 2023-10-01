package com.example.programminglanguages.business.responses;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GetByIdLanguageResponse {
    private  int id;
    private  String name;
}
