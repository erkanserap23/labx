package com.example.programminglanguages.dataAccess.abstracts;

import com.example.programminglanguages.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository  extends JpaRepository<Technology,Integer> {
}
