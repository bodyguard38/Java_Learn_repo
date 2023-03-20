package J27_Abstract.Abstract04;

public abstract class Food {//g parent abs class

    String name;
    public abstract void madeIn();//absmeth.
    public abstract void taste();//absmeth.

    @Override
    public String toString() {
        return
                "name='" + name ;

    }
}
