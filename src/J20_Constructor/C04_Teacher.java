package J20_Constructor;

public class C04_Teacher {//obj ureten kaliphane

    //field..
    String ad;
    String soyad;
    String brans;
    int id;
    int tecrube;
    double maas;
    boolean emekli;

    public C04_Teacher(String bahtiyar, String javacan, String java, int id, int tecrube, int maas, String evet) { //parametresiz cost.

    }



    public void dersSaati() {
        System.out.println("Agam haftali k15 sa sonrasi extra yagirer.");
    }


    public C04_Teacher(String ad, String soyad, String brans, int id, int tecrube, double maas, boolean emekli){

        /*
        Constructor içerisinden yukarıda(class level) tanımlanan object değişkenlerine(instance variable) erişilmek istenirse this keyword kullanılır.
        this keyword, o anda üzerinde işlem yapılan object'in referansını return eder ve böylece nesne değişkenlerine(instance variable) erişilir.
         Ancak nesne değişkenleri(instance variable) ile cons. parametre değişkenlerinin isimleri farklı olsaydı(soyad = Soyad) this keyword gerek kalmayacaktı.
         Bu kural sadece constructor için değil, bütün metotlar için geçerlidir.
         */

        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.id = id;
        this.tecrube = tecrube;
        this.maas = maas;
        this.emekli = emekli;

    }

    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                        ", soyad='" + soyad + '\'' +
                        ", brans='" + brans + '\'' +
                        ", id=" + id +
                        ", tecrube=" + tecrube +
                        ", maas=" + maas +
                        ", emekli=" + emekli;

    }
}
