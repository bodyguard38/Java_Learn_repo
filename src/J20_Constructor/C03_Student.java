package J20_Constructor;

public class C03_Student {//class level vagon obje icin aktif pasif bulunduran main siz class
     /*
    Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan 2 farklı obj ile
    mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
     */
    //fields...
    String ad;
    String soyAd;
    int sinif=58;
    double ortalama;
    int okulNo;
    boolean takdirBelgesi;

        @Override
    public String toString() {
            return
                    "ad='" + ad +'\'' +",soyAd='" +soyAd +'\''
                            +",sinif=" +sinif +",ortalama=" +ortalama
                            +",okulNo=" +okulNo +",takdirBelgesi="+ takdirBelgesi;
        }
        public static void main(String[] args) {//main level

            C03_Student ogrc1=new C03_Student();
            ogrc1.ad="Vedat";
            ogrc1.soyAd="offer";
            ogrc1.okulNo=1453;
            ogrc1.sinif=1;
            ogrc1.ortalama=70;
            ogrc1.takdirBelgesi=false;
            ogrc1.mezuniyet(ogrc1.ortalama);
            ogrc1.sosyalFaaliyet();
            System.out.println(ogrc1);

            C03_Student ogrc2=new C03_Student();
            ogrc2.ad="Ceren";
            ogrc2.soyAd="Team lead";
            ogrc2.okulNo=1905;
            ogrc2.sinif=1;
            ogrc2.ortalama=81;
            ogrc2.takdirBelgesi=true;
            ogrc2.mezuniyet(ogrc2.ortalama);
            ogrc2.sosyalFaaliyet();
            System.out.println(ogrc2);



            }///main level
    public void mezuniyet(double ortalama){
            if(ortalama>50){
                System.out.println("Agam diploma anca kusleme ile islatilir");
            }else{
                System.out.println("Bu ortalama il enasil mezun olacaksin sene ye de devam");
            }

        } public void sosyalFaaliyet(){
        System.out.println("Agam seni anca mangal basinda sosyal goruyorz  :)");
    }
}
