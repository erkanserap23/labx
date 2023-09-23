package org.etiya;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.added(new MySqlCustomerDal());

    }
}

// !! abstarc claslarda  imza bırakılır kim inheritance ederse o içini doldurur.

// interfaceler referans tipi tutar.
// class kabul edilmezler.
// tamamlanmamış gövdesiz methodlar içerir.
// bir class birden fazla interface eklene bilir.
//içi dolu method gibi ve  abstrac gibi kullanılması (anti patern)
//implement edilir.
//İnterfaceler,birçok farklı sınıfın ortak davranışını tanımlamak
//ve bir tür sözleşme (contract) oluşturmak için kullanılır.
//defult public

//Data Access Layer (DAL), bir yazılım uygulamasının bileşenlerinden biridir ve
//veri kaynaklarına (veritabanları, dosyalar, web servisleri vb.)
//erişim işlevselliğini içeren bir katmandır.


