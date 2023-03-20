package J28_Interface;

public interface DisDonanim {

    void kapi();//public abs method
    void kaporta();
    String renk="Kirmizi";//public static final initial variable
    public default String sislamp(){//public default cencrete meth obj call
        return "sisli havada mutlaka kulllanilmali";
    }
    public static void anten(){//public static concrete meth->interacename call
        System.out.println("Agam yine antin kuntin islerdesin");
    }

    public static void main(String[] args) {//interface e main method tanimlanabilir ama bed practice
        anten();//method call
       // sislamp(); non-static meth obj siz call edilemez
    }

    //DisDonanim obj = new    DisDonanim(); interface obj create edemez

}
