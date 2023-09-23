package org.etiya;

public class Main {
    public static void main(String[] args) {


       // TeacherCreditManager  teacherCreditManager =new TeacherCreditManager();
        //System.out.println(teacherCreditManager.calculation(1000));
        //daha iyi yazalım

          BaseCreditManager[] baseCreditManagers=new BaseCreditManager[]{
                  new TeacherCreditManager(), new SoldierCreditManager(),new StudentCreditManager() };

         for(BaseCreditManager baseCreditManager: baseCreditManagers ){
             System.out.println( baseCreditManager.calculation(1000));

         }



    }
}