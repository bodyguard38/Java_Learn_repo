package j10_MethodCreation.Task;

import java.util.Scanner;

public class Task23 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
       /*
        Task-> vucüt kitleendexini print eden METHOD create ediniz
        vki->kg(mt*mt)
        18,5 kg/m2 ve daha düşük değerler = Zayıf.
        18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
        25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
        30,0 ve üstü =  obezite.

    */
        vucudKitleEndexiHesapla();
    }

    private static void vucudKitleEndexiHesapla() {
        System.out.println("Kilonuzu kg olarak giriniz: ");
        double kilo = input.nextDouble();
        System.out.println("Boyunuzu mt olarak giriniz: ");
        double mt = input.nextDouble();

        double vki = kilo/(mt*mt);
        System.out.println("vki = " + vki);
        if(vki <= 18.5){
            System.out.println("Bizim oglan cok fit sin");
        }else if(vki<=24.9){
            System.out.println("Bizim oglan normal sin");
        }else if(vki<=29.9){
            System.out.println("Bizim oglan hamur yeme gri");
        }else System.out.println("OBEZITE");

    }
}
