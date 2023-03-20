package J27_Abstract.Abstract03;

public class Cenber extends Sekil {//abs parent sekil class aextend edilmis child bir class tir

    double yariCap;
    final double pi=3.14;
    @Override
    public double alan() {
        return pi*yariCap*yariCap;
    }

    @Override
    public double cevre() {
        return 2*pi*yariCap;
    }
}
