package J25_Inheritance.Inheritance01;

public class Runner {
    /*
    1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
    2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
    3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
    4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
    5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
    6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
    7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
       denir.
    8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
    9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/

    public static void main(String[] args) {

        Hayvancik h1 = new Hayvancik();
        h1.hareket();
        h1.beslenir();
        h1.icme();
        System.out.println("   ***   ");

        Mammal m1 = new Mammal();
        m1.dogum();
        m1.hareket();
        m1.beslenir();
        m1.icme();
        System.out.println("   ***   ");

        Balik p= new Balik();
        p.izgaraTava();
        p.hareket();
        p.beslenir();
        p.icme();
        System.out.println("   ***   ");

        Kedi k1 = new Kedi();
        k1.beslenir();
        k1.dogum();
        k1.hareket();
        k1.cirmala();
        k1.sutBeslen();
        k1.icme();
        System.out.println("   ***   ");

        Koyun k2 = new Koyun();
        k2.beslenir();
        k2.dogum();
        k2.semir();
        k2.hareket();
        k2.sutBeslen();

    }
}
