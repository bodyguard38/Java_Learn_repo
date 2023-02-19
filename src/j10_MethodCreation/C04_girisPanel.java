package j10_MethodCreation;


import static j10_MethodCreation.C04_ATMMethod.*;

public class C04_girisPanel {

    public static void sonKarar() {
        System.out.println("******       ********        ******** ");
        System.out.println("     DOST Banka hos geldiniz... \nDevam ->1\nCikis ->0");
        System.out.println("******       ********        ******** ");
        System.out.print("Lutfen seciminizi yapiniz :");
        int seçim = input.nextInt();
        if (seçim == 1) {
            System.out.println("işlem menü: \nBakıye sorgu->1\nPara çekme  ->2\nPara yatırma->3\nÇıkış       ->4");
            islemTercih();
        } else if (seçim == 0) {
            cikis();
        } else System.out.println(" AGAM adam gibi bişey giresen ");

    }

}
