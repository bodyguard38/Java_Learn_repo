package J25_Inheritance.Inheritance01.Task;

public class SubClass extends SuperClass {
    int sayi = 17;
   // public String ebikGabik(){
  //      return "Agam Subclass dan selam dewamkee";
   // }
   public static void main(String[] args) {
       SubClass sub = new SubClass();
       sub.javaCan();
   }//main sonu
    public void javaCan() {

       ebikgabik();//subclass method call
        super.ebikgabik();//superclass method call
        System.out.println("sayi = " + sayi);//child variable call edildi
        System.out.println("super.sayi = " + super.sayi);//parent method call
    }
    @Override
    public String ebikgabik() {
        return"Agam Subclass dan selam dewamkee";
    }
}//class sonu
