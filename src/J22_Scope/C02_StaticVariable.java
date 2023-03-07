package J22_Scope;

public class C02_StaticVariable {//class level

    /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate alınır

    Static variabler ise class variable olarak tanimlanir
            ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
    eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali
    public static void main(String[] args) {//main level
        */
    static String firmaIsim="Clarusway";
    static int firmaId;
    static boolean firmaIt;

    public static void main(String[] args) {//main level

        System.out.println("firmaIt = " + firmaIt);
        firmaIt=true;//static variable dogrudan call edilip value atandi->best practice

        C02_StaticVariable.firmaId=2021;//class name ile static variable call edilip value atandi -> bad practice
        staticMethod();//static method static bloga dogrudan call edildi
        //nonStaticMethod();//non static method non static bloga dogrudan call edilemezz...

    }//main level
    public static void staticMethod() {//static method ->galaxi
        System.out.println("value atamasi oncesi"+firmaId);
        firmaId=2023;//initial edilmemis static variable blok adogrudan call edilip value atandi.
        System.out.println("value atamasi sonrasi "+firmaId);

    }
    public void non_staticMethod() {//non_static method-> sefil dunyali
        System.out.println("firmaIsim update oncesi = " + firmaIsim);
        firmaIsim="offera en kisa yolClarusway";//initial edilmis static variable non static bloka update edildi
        System.out.println("firmaIsim update sonrasi = " + firmaIsim);

    }
}//class sonu
