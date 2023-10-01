package com.example.programminglanguages.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Technologes")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private  int id;

    @Column(name="name")
    private  String name;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Languages language;

}
