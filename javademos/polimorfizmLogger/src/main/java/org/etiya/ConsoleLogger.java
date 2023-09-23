package org.etiya;

public class ConsoleLogger extends BaseLogger {

    public  void log( String message){
        System.out.println("ConsoleLogger : " +message);
    }
}
