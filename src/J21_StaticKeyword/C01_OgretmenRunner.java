package J21_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
        C01_Ogretmen.okul="clarusway";// gunes update edildi
        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);
        C01_Ogretmen ogrt1 = new C01_Ogretmen("Eda",11);
        System.out.println(ogrt1.isim);
        System.out.println("ogrt1.tecrube = " + ogrt1.tecrube);
      //  ogrt1.okul ->obj ile static variable call edilmez..

        ogrt1.evlilikYilDonumu();
        C01_Ogretmen.maasHesapla();
        C01_Ogretmen.okul="Kabatas";
        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);

        C01_Ogretmen ogrt2 = new C01_Ogretmen("Aydin",7);
        System.out.println("ogrt2.isim = " + ogrt2.isim);
        System.out.println("ogrt2.tecrube = " + ogrt2.tecrube);
    }
}
