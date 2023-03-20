package J27_Abstract.Abstract03;

public class Dikdortgen extends Sekil{

    double en;
    double boy;

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    @Override
    public double alan() {
        return en*boy;
    }

    @Override
    public double cevre() {
        return 2*(boy+en);
    }
}
