import java.util.*;

public class s {

    static Scanner input = new Scanner(System.in);
    static HashMap<String, String> kisi =new HashMap<>();
            /* Task->
       Girilen tc kimlik numarasini(4 haneli), tam isim(ad-soyad), adres, telefon bilgi
       tc ile diğer bilgileri depolayan kayıt();
       tc ile diğer bilgileri okutan goster();
       tc ile diğer bilgileri silen
       methodları create edip kullanıcı sonlandırana kadar tercihli run eden pr yazınız.
             */
    public static void main(String[] args) throws InterruptedException {

        selectOption();


    }

    private static void selectOption() throws InterruptedException {
        System.out.println("*********************   ***   ***********************");
        System.out.print("Yapmak istediginiz islem nedir? \n1->Islemi sonlandir\n2->Kullanici ekle\n3->Kullanici bilgisi\n4->Kullanici silme\nIsleminizi giriniz : ");
        int secim= Integer.parseInt(input.next());

        switch (secim) {
            case 1:
                cikis();
                break;
            case 2:
                ekle();
                break;
            case 3:
                getir();
                break;
            case 4:
                sil();
                break;
            default:
                System.out.println("Yanlis giris yaptiniz.Lutfen tekrar deneyiniz.");
                Thread.sleep(2000);
                selectOption();
                break;
        }
    }

    private static void sil() throws InterruptedException {
        System.out.println("Lutfen silinecek kisinin tc sini giriniz : ");
        String silinecekTc = input.next();
        if(kisi.containsKey(silinecekTc)) {
            kisi.remove(silinecekTc);
            System.out.println("Girilen tc basari ile silindi."+kisi);
            Thread.sleep(2000);
        }else {
            System.out.println("Aradiginiz tc sistemde bulunamamistir\n lutfen tekrar deneyiniz");
            sil();
        }
        Thread.sleep(2000);
        selectOption();
    }

    private static void getir() throws InterruptedException {
        System.out.println("Lutfen aradiginiz tc numarasini giriniz :");
        String arananTc= input.next();
        if(kisi.containsKey(arananTc)){
            System.out.println("Aranan kisi listede vardir..");
            Thread.sleep(1000);
            System.out.println(kisi.get(arananTc));
        }else{
            System.out.println("Aradiginiz tc ile iliskili bir kisi yoktur.\nLutfen tekrar deneyiniz");
            Thread.sleep(2000);

        }
        selectOption();
    }

    private static void ekle() throws InterruptedException {
        System.out.println("Lutfen 4 haneli tc kimlik numaranizi giriniz  :");
        String tc = input.next();


        if(kisi.containsKey(tc)){
            System.out.println("Sistemde olan bir tc numarasi girdiniz lutfen baska bir no giriniz");

        }else{
            System.out.println("Adinizi giriniz  : ");
            String name = input.nextLine();
            input.nextLine();

            System.out.println("Soyadinizi giriniz :  ");
            String surName = input.nextLine();

            System.out.println("Adres giriniz  :");
            String adres= input.nextLine();

            System.out.println("Telefonunuzu giriniz  ;");
            String tel = input.nextLine();


            String values = name + " "+ surName + " "+ adres + " "+ tel;
            kisi.put(tc, values);
            System.out.println("Verileriniz dogru sekilde kaydedilmistir. Veriler "+kisi);

            Thread.sleep(2000);
            selectOption();

        }
    }

    private static void cikis() {
        System.out.println("Cikis isleminiz yapilmistir.Yine bekleriz....");
    }
}


