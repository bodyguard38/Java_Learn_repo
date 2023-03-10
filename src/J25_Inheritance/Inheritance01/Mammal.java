package J25_Inheritance.Inheritance01;

public class Mammal extends Hayvancik{

    public Mammal() {//p siz constructor
        System.out.println("Agam p siz Mammal construtor call edildi");
    }
    public void sutBeslen(){
        System.out.println("Bebeleri sut ile besler");
    }
    public void dogum(){
        System.out.println("Nur topu gibi yavrusu olur");
    }
}
