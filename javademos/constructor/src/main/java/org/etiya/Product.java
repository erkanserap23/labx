package org.etiya;

public class Product {
    public Product(){
        //boş constructor
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;

        //parametreli constructor
    }



    private int id;
    private String  name;


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
