package org.etiya;

public class Product {
    private String name;
    private double unitPrice;
    private double discount;
    private String imageUrl;
    private int unitsInStock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

}

//  !Pascal case kelimenin ilk harfi büyük
//  oop nesne güdümlü programala dilidir.
//  nesne yönelimli - nesne güdümlü programlar sürdürebilirlik katar.
//  deger atama set - deger okuma get
//  Java'da "class" (sınıf), nesne yönelimli programlamada (OOP) temel bir yapı taşıdır.