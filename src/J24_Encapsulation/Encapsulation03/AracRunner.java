package J24_Encapsulation.Encapsulation03;

public class AracRunner {
    public static void main(String[] args) {

        Arac arc1 = new Arac();//p siz cons call edilerek obj create edildi
        Arac arc2 = new Arac("Bmw","siyah",2000,2009);
        Arac arc3 = new Arac("Audi","bejjj",300,-1905);

        System.out.println("arc1.getModel() = " + arc1.getModel());//null
        System.out.println("arc1.getMotor() = " + arc1.getMotor());//0
        System.out.println("arc1.getRenk() = " + arc1.getRenk());//null
        System.out.println("arc1.getYil() = " + arc1.getYil());//0

        arc1.setYil(-1974);
        arc1.setModel("Haci Murat");
        arc1.setMotor(1300);
        arc1.setRenk("Civciv sarisi");

        System.out.println("arc1.getYil() = " + arc1.getYil());
        System.out.println("arc1.getRenk() = " + arc1.getRenk());
        System.out.println("arc1.getMotor() = " + arc1.getMotor());
        System.out.println("arc1.getModel() = " + arc1.getModel());

        System.out.println("arc2 = " + arc2);
        System.out.println("arc3 = " + arc3);
        System.out.println("arc3.getYil() = " + arc3.getYil());
        System.out.println("arc3.getMotor() = " + arc3.getMotor());

    }//main sonu
}
