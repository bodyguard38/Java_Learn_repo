package J28_Interface;

public class Runner {
    public static void main(String[] args) {

        Sahin s1 = new Sahin();
        s1.kapi();//Agam dort kapi SEDAN
        s1.kaporta();//Agam akordion KAPORTA gamzesiz olmaz
        s1.jant();//Ägam senin gibi janti adama 5 kollu celik gider
        s1.ebat();//Agam 15 inc lastik
        s1.koltuk();//Agam deri KOLTUK yazin pisik yapar
        s1.klima();//Agam ac cami serinle
        s1.motor();//Agam 1.6 cok yakar aza kacar motor
        s1.yakit();//Agam Tuo taktik yoksa ocaina incir agaci diker
        s1.sislamp();//Agam gunesli havada sunroof u acarsan bogrune maaasallah yazarsin
        s1.sunroof();
        DisDonanim.anten();
        //DisDonanim.RENK="civciv"
        System.out.println("DisDonanim.renk = " + DisDonanim.renk);

        System.out.println("IcDonanim.RENK = " + IcDonanim.RENK);
        System.out.println("Lastik RENK ="+Lastik.RENK);

        System.out.println("IcDonanim.MUSIC = " + IcDonanim.MUSIC);
        System.out.println(IcDonanim.KUMAS);

    }
}
