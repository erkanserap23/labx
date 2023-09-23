package org.etiya;

public class Product {

    private int id;
    private String name;
    private String description;
    private double price;
    private boolean stockAmount;
    private String code;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(boolean stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getCode() {
        return  this.name.substring(0,1)+ this.id;
    }


}
    /*

    Encapsulation (Kapsülleme), nesne tabanlı programlamada bir nesnenin
    iç durumunun (veri alanları) ve
    davranışlarının (metodlar)
    dışarıdan erişime karşı korunması ve kontrol edilmesi anlamına gelir.

    *Gizlilik (Privacy):
    *Modülerlik (Modularity):
    *Kodun Daha Okunabilir Olması

    Özel Alanlar (Private Fields): Sınıfın veri alanları (fields) genellikle özel
    (private) olarak tanımlanır, yani sadece sınıf içinden erişilebilirler.

    Getter ve Setter Metodları: Veri alanlarına dışarıdan erişmek veya bu
    alanları güncellemek için public getter ve setter metodları kullanılır.
    Getter, alanın değerini okumak için kullanılırken,
    Setter alanın değerini güncellemek için kullanılır.


    */
