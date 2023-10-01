package com.example.programminglanguages.dataAccess.abstracts;

import com.example.programminglanguages.entities.concretes.Languages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguagesRepository extends JpaRepository<Languages,Integer> {

}
