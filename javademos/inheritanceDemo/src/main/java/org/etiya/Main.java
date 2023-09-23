package org.etiya;

public class Main {
    public static void main(String[] args) {

        // TeacherCreditManager teacherCreditManager=new TeacherCreditManager();
        // teacherCreditManager.calculate();

        CreditUI creditUI = new CreditUI();
        //creditUI.creditCalculate(new TeacherCreditManager());
        creditUI.creditCalculate(new AgricultureCreditManager());

    }
}

// ortak metotları tekrar tekrar yazmamak içim inheritanse kullandık.
// değişime direnmeyen sürdürülebilirlik olması içinde inheritanse kullanalım.
// tek bir classı extend edebilir
// baseCreditmaneger hepsi extends ettigi için tek tek yapmamıza gerek yok
// referans tipi oldugundan anne çocuk
//yani polimorfizm