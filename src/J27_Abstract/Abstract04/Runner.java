package J27_Abstract.Abstract04;

public class Runner {

    public static void main(String[] args) {

        Baklava havucDilimi=new Baklava();
        havucDilimi.name="bol fistikling";
        havucDilimi.madeIn();
        System.out.println("havucDilimi = " + havucDilimi);
        havucDilimi.taste();//Good,sugar,sweet

        SezarSalade s = new SezarSalade();
        s.name="gavur dagi";
        s.madeIn();//made in Italy
        System.out.println("s = " + s);


    }
}
