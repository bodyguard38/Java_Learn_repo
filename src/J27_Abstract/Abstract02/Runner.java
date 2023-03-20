package J27_Abstract.Abstract02;

public class Runner {
    public static void main(String[] args) {

        Isci mrb1= new Isci();

        mrb1.name="BiloCan";
        System.out.println("mrb1.name = " + mrb1.name);//BiloCan
        mrb1.maasBilgisi();//Agam maraba isciye en cok yevmiye 499 kayme verilir
        mrb1.maasHesapla();//Agam maraba isi cay cigara haric gunde 8 sa kurek mahkumu  :)



        IdariPersonel cnc1= new IdariPersonel();
        cnc1.name="Ceku";
        System.out.println("cnc1.name = " + cnc1.name);
        cnc1.maasBilgisi();
        cnc1.maasHesapla();
        cnc1.sigorta();


    }
}
