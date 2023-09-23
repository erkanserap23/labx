package org.etiya;

public class EmailLogger extends BaseLogger {
    public  void log( String message){
        System.out.println("EmailLogger : " +message);
    }
}
