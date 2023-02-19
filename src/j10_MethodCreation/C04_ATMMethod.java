package j10_MethodCreation;


import java.util.Scanner;

import static j10_MethodCreation.C04_girisPanel.sonKarar;

public class C04_ATMMethod {
    static Scanner input = new Scanner(System.in);//class level en tepeye gökdeki güneş yapıldı ki herkes ulaşabilsin
    static int bakiye = 1500;//class level en tepeye gökdeki güneş yapıldı ki herkes ulaşabilsin
    public static void islemTercih() {
        System.out.print("Lutfen isleminizi seciniz : ");

        int islemSecim = input.nextInt();

        switch (islemSecim) {

            case 1://1.işlem bakıye sorgu
                bakiyeSorgula();
                sonKarar();
                break;
            case 2://2. işlem para-çekme
                paraCekme();
                sonKarar();
                break;
            case 3://3.işlem para yatırma
                paraYatır();
                sonKarar();

                break;
            case 4://4.işlem çıkış
                cikis();

                break;
            default:
                System.out.println("lütfen geçerli değer giriniz  ");


        }




}

    private static void paraCekme() {
        System.out.println("Lutfen cekmek istediginiz miktari giriniz");
        int cekilenMiktar = input.nextInt();
        if (cekilenMiktar <= bakiye) {
            System.out.println("Hesabinizdan "+cekilenMiktar+" para cekilmistir.");
            bakiye -= cekilenMiktar;
        }else System.out.println("Bakiyeniz yeterli degil");
    }

    public static void bakiyeSorgula() {
        System.out.println("Güncel  bakıyeniz : " + bakiye);
    }

    private static void paraYatır() {
        System.out.print("yatıracagınız miktarı giriniz : ");
        int yatanMiktar=input.nextInt();
        bakiye+= yatanMiktar;
        System.out.println("hesabınıza "+yatanMiktar+" geçmiştir " );
    }

    static void cikis() {
        System.out.println("çıkış işleminiz başarı ile yapılmıştır. Yine bekleriz.. SELAMETLE ");
    }
}

