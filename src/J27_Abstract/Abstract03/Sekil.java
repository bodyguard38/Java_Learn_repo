package J27_Abstract.Abstract03;

public abstract class Sekil {
    String name;
    public abstract double alan();
    public abstract double cevre();

    public void ciz(){//concrete method

        System.out.println(this.name+" cizildi");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\''+
                "\n Alan="+this.alan()+
                "\n cevre =  "+this.cevre();
    }
}
