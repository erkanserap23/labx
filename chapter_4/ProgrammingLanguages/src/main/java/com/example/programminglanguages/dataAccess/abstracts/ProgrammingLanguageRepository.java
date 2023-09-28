package com.example.programminglanguages.dataAccess.abstracts;

import com.example.programminglanguages.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage) throws Exception;
    void update(ProgrammingLanguage programmingLanguage) throws Exception;

    List<ProgrammingLanguage>getAll();
    ProgrammingLanguage getById(int id);
}
