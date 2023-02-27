package J17_PassByValue;

public class C03_PassByValue { //class basi
    static double etiketFiyati;    //Gunes->  her gezegene etkisi olan yapi
    static double indirimOrani;
    public static void main(String[] args) {//main basi
        /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse
        1.değişklik  yapılan variable'lar static (gökteki güneş) olarak tanımlanır.
         */
        etiketFiyati = 100;//güneş değeri 100 atandı
        indirimOrani = 0.1;
        System.out.println("indirim öncesi etiketFiyatı = " + etiketFiyati);//100.0

        // indir(etiketFiyatı, indirimOrani);//meth. call->90.0
        indirPsiz();//meth. call-> 90
        indirimOrani=0.25;

        //  indir(etiketFiyatı, indirimOrani);//meth. call->75.0
        indirPsiz();//meth. call-> 67.5
        indirimOrani=0.5;

        // indir(etiketFiyatı, indirimOrani);//meth. call->50.0
        indirPsiz();//meth. call-> 33.75

        System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyati);//100.0
    }//main sonu

    private static void indirPsiz() {
        etiketFiyati*=(1-indirimOrani);
        System.out.println("p'siz methodda etiket fiyatı : "+etiketFiyati);
    }

    private static void indirPli(double etiketFiyatı, double indirimOrani) {
        etiketFiyatı*=(1-indirimOrani);
        System.out.println("indirilmiş etiket fiyatı : " + etiketFiyatı);

    }



}//class sonu
