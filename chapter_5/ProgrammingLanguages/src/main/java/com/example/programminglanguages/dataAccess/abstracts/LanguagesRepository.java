package com.example.programminglanguages.dataAccess.abstracts;

import com.example.programminglanguages.entities.concretes.Languages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguagesRepository extends JpaRepository<Languages,Integer> {

}
