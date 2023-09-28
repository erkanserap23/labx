package com.example.programminglanguages.entities.concretes;

public class ProgrammingLanguage {
    private int id;
    private String name;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
