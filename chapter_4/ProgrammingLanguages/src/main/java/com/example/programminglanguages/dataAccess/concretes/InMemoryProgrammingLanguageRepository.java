package com.example.programminglanguages.dataAccess.concretes;

import com.example.programminglanguages.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.programminglanguages.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    List<ProgrammingLanguage> programmingLanguagesList;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguagesList = new ArrayList<ProgrammingLanguage>();
        programmingLanguagesList.add(new ProgrammingLanguage(1, "C#"));
        programmingLanguagesList.add(new ProgrammingLanguage(2, "python"));
        programmingLanguagesList.add(new ProgrammingLanguage(3, "C++"));
        programmingLanguagesList.add(new ProgrammingLanguage(3, "Java"));

    }

    @Override
    public void add(ProgrammingLanguage programmingLanguages) {
        programmingLanguagesList.add(programmingLanguages);

    }

    @Override
    public void delete(int id) throws Exception {
        if (getById(id) != null) {
            programmingLanguagesList.remove(getById(id));
            System.out.println("deleted");
        } else {
            throw new Exception("no language found to delete");
        }

    }

    @Override
    public void update( int id, ProgrammingLanguage programmingLanguages) throws Exception {
        if (getById(id) != null) {

            for (ProgrammingLanguage value : programmingLanguagesList) {
                if (value.getId() == id) {
                    value.setName(programmingLanguages.getName());
                    System.out.println("updated");
                }
            }

        } else {
            throw new Exception("language for id not found");
        }
    }

    @Override
    public List<ProgrammingLanguage> getAll() {

        return programmingLanguagesList;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage value : programmingLanguagesList) {
            if (value.getId() == id) {
                return value;
            }
        }
        return null;
    }
}

//database