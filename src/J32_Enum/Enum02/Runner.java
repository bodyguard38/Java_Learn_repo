package J32_Enum.Enum02;

public class Runner {
    public static void main(String[] args) {

        User kll=new User();
        kll.name="Vedat bey";
        kll.role=0;
        kll.status=2;

        kll.yetki=Role.ADMIN;
        kll.durum=Status.ACTIVE;

        User kl2=new User();
        kl2.name="Ahmet bey";
        kl2.role=0;
        kl2.status=2;

        kl2.yetki=Role.CUSTOMER;
        kl2.durum=Status.INACTIVE;

        if(kll.yetki==Role.ADMIN){
            System.out.println(kll.name+" Agam muhur sende sil de silelim");
        }else System.out.println(kll.name+" tee ellam ya sefil customer silmeye gelmis");
        if(kl2.yetki==Role.ADMIN){
            System.out.println(kl2.name+" Agam muhur sende sil de silelim");
        }else System.out.println(kl2.name+" tee ellam ya sefil customer silmeye gelmis");
    }
}
