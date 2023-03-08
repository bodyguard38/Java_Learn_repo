package J13_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_Market {
    static Scanner sc = new Scanner(System.in);
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    public static <integer> void main(String[] args) {

        ArrayList<String> gunler= new ArrayList<>();
        gunler.addAll(Arrays.asList("Pazartesi", "Sali", "Carsanba", "Persenbe","Cuma", "Cumartesi", "Pazar"));



        ArrayList<Integer> gunlukKazanclar= new ArrayList<>();

            for (int i = 1; i <=7 ; i++) {
                System.out.print(gunler.get(i-1)+" gunu yapilan ciroyu giriniz  :  ");
                int gelir=sc.nextInt();
                gunlukKazanclar.add(gelir);


            }

        getOrtalamaKazanc(gunlukKazanclar);

    }

    


    private static void getOrtalamaKazanc(ArrayList<Integer> gunlukKazanclar) {
        int sum = 0;

        for (int i = 0; i < gunlukKazanclar.size() ; i++) {
            sum+=gunlukKazanclar.get(i);

        }
        int toplam=(sum/7);
        System.out.println("Marketin gunluk ortalama kazanci  : "+toplam+" Tl dir.");
    }

}
