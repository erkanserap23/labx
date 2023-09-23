package org.etiya;

public class CustomerManager {

    public void add() {
        System.out.println("added");
    }

    public void remove() {
        System.out.println("removed");

    }

    public void update() {
        System.out.println("updated");
    }


}
    /* method :belirli bir işlemi gerçekleştiren ve tekrar tekrar kullanılabilir kod bloklarıdır.

     erişimBelirleyici geriDönüşTipi metodAdı(parametreListesi) {
     //Metodun işlevi
    }

    erişimBelirleyici: Metodun erişim düzeyini (public, private, protected vb.) belirler.
    geriDönüşTipi: Metodun bir değer dönüp dönmeyeceğini ve dönecekse hangi türde bir değer döneceğini belirler. Eğer metodun geri dönüş değeri yoksa void kullanılır.
    metodAdı: Metodun adıdır ve bu adı kullanarak metod çağrılır.
    parametreListesi: Metoda gelen verilerin türünü ve isimlerini içerir. Metodun parametre almadığı durumlarda boş bırakılabilir.

    Kodun parçacıklara bölünmesini sağlar, böylece kod daha okunaklı ve sürdürülebilir olur.
    Aynı kodun tekrar tekrar yazılmasını engeller, bu sayede kod tekrarı azalır.
    Bir hata bulunduğunda sadece bir kez düzeltilmesini sağlar, bu da bakımı kolaylaştırır.

     */
