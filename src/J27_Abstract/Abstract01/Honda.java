package J27_Abstract.Abstract01;

public abstract class Honda {
    public abstract void motor();//abs->body siz implement zorunlu method

    void sunroof() {//concrete ->body li method
        System.out.println("Agam keyfini bilirsensunroof u acarsan maasallah yazdirirsin");
    }
        //abs. class oncrete variable tanimlanir mi?
    String isim ="Murat bey";
    //abs. class da abs variable tanimlanir mi?  o lamaz
    //String str="javCAN";
    abstract void kapi();
    abstract void koltuk();
    //final void finalMethod(); //final abs. method tanimlanamaz body siz olamaz
    //final void finalMethod();//abs meth final olamaz

    //private abstract void privateMethod(); //abs method kisitlanamaz yani private olamaz
    //static void gunesMethod();//static concrete method body siz olamaz

    //static abstract void gunesMethod();//abs static method olamaz
    //Honda h1 = new Honda();//abs class obj uretemez ->melek dogurmaz
}
