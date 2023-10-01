package com.example.programminglanguages.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateLanguageRequest {
    private  int id;
    private  String name;
}
