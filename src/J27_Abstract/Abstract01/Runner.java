package J27_Abstract.Abstract01;

public class Runner {

    public static void main(String[] args) {

    Civic c1=new Civic();

    c1.motor();//Agam 1.6 eco motor neyine yetmeyii
    c1.kapi();//Agam kapi elinde kalmasin yavas kapa
    c1.koltuk();//Agam ucuza kacip kumas cakmissin
    c1.koltuk();
    c1.isim="TypeR";
        System.out.println("c1.isim = " + c1.isim);

    Honda c2= new Accord();
    c2.isim="Console car";
    c2.koltuk();//Ägam deri koltuk ter yapar
    c2.kapi();//Vakumlu kapi carmasin
    c2.motor();//Agam 2.0 turbo cok yakar hizli kacar


    }
}
