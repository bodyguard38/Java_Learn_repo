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
        switch (sehir) {
            case    "B":
            case    "b":
                    biletUcretiB();
                break;
            case    "C":
            case    "c":
                    biletUcretiC();
                break;
            case    "D":
            case    "d":
                    biletUcretiD();
                break;
        default:
            System.out.println("Lutfen belirtilen bir deger giriniz..");


        }
    }

    private static void biletUcretiD() {
        double ucretD=0.10*900;
        System.out.println(ucretD);
    }


    private static void biletUcretiC() {
        double ucretC =0.10*700;
        System.out.println(ucretC);
    }

    private static void biletUcretiB() {
      double  ucretB=0.10*500;
        System.out.println(ucretB);
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
