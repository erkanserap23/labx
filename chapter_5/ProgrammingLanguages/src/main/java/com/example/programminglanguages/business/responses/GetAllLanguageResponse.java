package com.example.programminglanguages.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllLanguageResponse {
    private  int id;
    private  String name;

}
