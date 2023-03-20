package J27_Abstract.Abstract03;

public class Runner {
    public static void main(String[] args) {
        Cenber c1 = new Cenber();
        c1.name="Cenber";
        c1.yariCap=5;


        c1.ciz();
        System.out.println("c1.alan() = " + c1.alan());
        System.out.println("c1.cevre() = " + c1.cevre());


        Dikdortgen d1 = new Dikdortgen(12,35);
        d1.name="Dikdortgen";
        System.out.println("d1.alan() = " + d1.alan());
        System.out.println("d1.cevre() = " + d1.cevre());
        System.out.println("d1 = " + d1);
    }
}
