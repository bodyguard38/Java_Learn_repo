package J27_Abstract.Abstract01;

public class Civic extends Honda{
      /*
     extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
     java CTE verdi
     çözüm:
     a) Unımplemented (uyarlanmamış) method implement edilmeli
     b)parent Honda class'dan abstarct keyword kaldırılmalı
     c)concrete olan child Civic class abstract tanımlanmalı
      */

    // concerete class'da abstract method tanımlanır mı?
    // public  abstract void absMethod();// ya class abs olmalı yada method concrete body olmalı..
    // TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli

    @Override
    public void motor() {
        System.out.println("Agam 1.6 eco motor neyine yetmeyii");
    }

    @Override
    void kapi() {
        System.out.println("Agam kapi elinde kalmasin yavas kapa");
    }

    @Override
    void koltuk() {
        System.out.println("Agam ucuza kacip kumas cakmissin");
    }
    //polymorphisim -> obj nin cok bicimliligi
  //Civic c1 = new Civic();//civic child class data type obj
  //Honda c2 = new Civic();//honda abs parent class data type obj
}
