package J28_Interface;

public class Sahin extends Tofas implements DisDonanim,IcDonanim,Lastik{
    @Override
    public void motor() {
        System.out.println("Agam 1.6 cok yakar aza kacar motor");
    }

    @Override
    public void yakit() {
        System.out.println("Agam Tuo taktik yoksa ocaina incir agaci diker");
    }

    @Override
    public void kapi() {
        System.out.println("Agam dort kapi SEDAN");
    }

    @Override
    public void kaporta() {
        System.out.println("Agam akordion KAPORTA gamzesiz olmaz");
    }

    @Override
    public void koltuk() {
        System.out.println("Agam deri KOLTUK yazin pisik yapar");
    }

    @Override
    public void klima() {
        System.out.println("Agam ac cami serinle");
    }

    @Override
    public void ebat() {
        System.out.println("Agam 15 inc lastik");
    }

    @Override
    public void jant() {
        System.out.println("Ägam senin gibi janti adama 5 kollu celik gider");
    }
}
