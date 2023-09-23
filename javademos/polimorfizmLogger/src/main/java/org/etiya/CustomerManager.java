package org.etiya;

public class CustomerManager {

    private BaseLogger loger;

    public CustomerManager(BaseLogger loger) {
        this.loger = loger;
    }

    public  void add(String message){
        System.out.println("added" +message);
        loger.log("!!! added");


    }

}
