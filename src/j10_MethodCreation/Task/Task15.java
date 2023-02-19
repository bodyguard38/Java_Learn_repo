package j10_MethodCreation.Task;



import java.util.Scanner;

public class Task15 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirsa 20% indirim uygulayan bir app create ediniz
     */
        ucusMenu();




    }



    private static void biletAlimMenusu() {
        System.out.println("Nereye gitmek istiyorsunuz?");
        String sehir = input.nextLine();
        System.out.println("hata burda mi");
        switch (sehir) {
            case    "B":

                    biletUcretiB();
                System.out.println("yoksa");
                break;
            case    "C":

                    biletUcretiC();
                System.out.println("neresi");
                break;
            case    "D":

                    biletUcretiD();
                System.out.println("burdaamiyiz");
                break;
        default:
            System.out.println("Lutfen belirtilen bir deger giriniz..");


        }
    }

    private static void biletUcretiD() {
        double ucretD=0.10*900;
        yasHesaplaD(ucretD);
    }

    private static void yasHesaplaD(Double ucretD) {
        System.out.println("Lutfen yasinizi giriniz :");
        int yas = input.nextInt();
        if (yas>0&&yas<=12) {
            ucretD=ucretD*0.50;
        }else if (yas>12&&yas<=24) {
            ucretD=ucretD*0.90;
        } else if (yas>65) {
            ucretD=ucretD*0.70;
        }
        System.out.println("Cift yonlu bilet istiyor musunuz?\nEvet icin ->1 \nHayır icin ->2");
        int yolcu = input.nextInt();
        if (yolcu==1) {
            ucretD=(ucretD*0.20)*2;
        }else if (yolcu==2) {
            System.out.println(ucretD);
        }
    }


    private static void biletUcretiC() {
        double ucretC =0.10*700;
        yasHesaplaC(ucretC);
    }

    private static void yasHesaplaC(Double ucretC) {
        System.out.println("Lutfen yasinizi giriniz :");
        int yas = input.nextInt();
        if (yas>0&&yas<=12) {
            ucretC=ucretC*0.50;
        }else if (yas>12&&yas<=24) {
            ucretC=ucretC*0.90;
        } else if (yas>65) {
            ucretC=ucretC*0.70;
        }
        System.out.println("Cift yonlu bilet istiyor musunuz?\nEvet icin ->1 \nHayır icin ->2");
        int yolcu = input.nextInt();
        if (yolcu==1) {
            ucretC=(ucretC*0.20)*2;
        }else if (yolcu==2) {
            System.out.println(ucretC);
        }
    }


    private static void biletUcretiB() {
      double  ucretB=0.10*500;
        yasaGoreHesapla(ucretB);
    }

    private static void yasaGoreHesapla(double ucretB) {
        System.out.println("Lutfen yasinizi giriniz :");
        int yas = input.nextInt();
        if (yas>0&&yas<=12) {
            ucretB=ucretB*0.50;
        }else if (yas>12&&yas<=24) {
            ucretB=ucretB*0.90;
        } else if (yas>65) {
            ucretB=ucretB*0.70;
        }
        System.out.println("Cift yonlu bilet istiyor musunuz?\nEvet icin ->1 \nHayır icin ->2");
        int yolcu = input.nextInt();
        if (yolcu==1) {
            ucretB=(ucretB*0.20)*2;
        }else if (yolcu==2) {
            System.out.println(ucretB);
        }
    }

    private static void ucusMenu() {
        System.out.println("********************************************");
        System.out.println("**              *     *    *              **");
        System.out.println("**          *                  *          **");
        System.out.println("**       *                        *       **");
        System.out.println("**      KLM havayollarina hosgeldiniz     **");
        System.out.println("**Lutfen yapmak istediginiz islemi seciniz**");
        System.out.print("Bilet almak icin -> 1 \ncikmak icin -> 2 \ntuslayiniz");
        int bilet = input.nextInt();
             if (bilet == 1) {
            System.out.println("Bilet alma menusune yonlendiriliyorsunuz lutfen biraz bekleyiniz " );
                 biletAlimMenusu();
            }else if (bilet == 2) {
            System.out.println("Cikis isleminiz yapiliyor her zaman bekleriz...");
        }



    }
}
