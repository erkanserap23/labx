package org.etiya;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
    }
}

       // classlar referans tipidir bellekte stack-heap de nesne oluşur
       // might not have beet initialized
       // Camel Case: calculateTotal -metot ve nesne adlarında
       // Pascal Case:ProductDetails-genellikle sınıf adlarında

       /* garbage collector :programın çalışma zamanında kullanılmayan ve
       referansı tutulmayan nesneleri
       bellekten temizleyen bir otomatik bellek yönetimi mekanizmasıdır.
        */