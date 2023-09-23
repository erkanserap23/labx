package org.etiya;

public class Main {
    public static void main(String[] args) {

      BaseLogger[] loggers=new BaseLogger[]{new EmailLogger() , new DatabaseLogger(),new FilleLogger()};

      for(BaseLogger logger:loggers ){
          logger.log("log mesajı");
      }

      CustomerManager customerManager= new CustomerManager( new DatabaseLogger());
       customerManager.add("main customer manager ..!!");


    }
}

// baseLoggerdaki  log method aynısı ile overriding (ezme)
// dependency injection" veya "bağımlılık enjeksiyonu