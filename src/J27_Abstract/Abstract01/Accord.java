package J27_Abstract.Abstract01;

public class Accord extends Honda{//concrete child -> Honda abs class aextend

    @Override
    public void motor() {//override edilmis -> Abs parent ten zorunlu implement edilmis concrete meth.
        System.out.println("Agam 2.0 turbo cok yakar hizli kacar");

    }

    @Override
    void sunroof() {//override edilmis -> Abs parent ten zorunlu olmayan concrete meth.
        System.out.println("Agam cugara yakinca sunroof acmayi unutma");
    }

    @Override
    void kapi() {//override edilmis -> Abs parent ten zorunlu implement edilmis concrete meth.
        System.out.println("Vakumlu kapi carmasin");
    }

    @Override
    void koltuk() {//override edilmis -> Abs parent ten zorunlu implement edilmis concrete meth.
        System.out.println("Ägam deri koltuk ter yapar");
    }
}
