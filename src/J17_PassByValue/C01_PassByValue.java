package J17_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
    Java Pass By Value bir programlama dilidir.
    Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable
    değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

        */
    // task -> verilen fiyat için %24 artırılmış fiyatı print eden method  create ediniz.

        double price =100;
        System.out.println("price = " + price);
        prijsHoog(price);
        System.out.println("price = " + price);
    }//main sonu

    private static void prijsHoog(double price) {

        price *=1.24;
        System.out.println("prijs is omhoog: " + price);
    }
}
