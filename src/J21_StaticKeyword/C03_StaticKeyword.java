package J21_StaticKeyword;

public class C03_StaticKeyword {//class level
    int ogrcId;//ins obje variable
    static int ogrcSayisi;//static gunes
    public C03_StaticKeyword() {
        ogrcSayisi++;// bu cons her cool edildiginde obj create edildiginde ogrcSayisi
        // static variable kalici olarak  artar.
        ogrcId+=ogrcSayisi;//bu cons her call edildiginde yani obj create dildiginde ogrcId create edilen obj degeri olarak atanir.

    }

    public static void main(String[] args) {//main level
        System.out.println("ogrcSayisi = " + ogrcSayisi);// 0
        C03_StaticKeyword a = new C03_StaticKeyword(); // a ogrc create edilddiginnde
        System.out.println("ogrcSayisi = " + ogrcSayisi);//1

        C03_StaticKeyword b = new C03_StaticKeyword();// b ogrc create edildiginde
        C03_StaticKeyword c = new C03_StaticKeyword();//c ogrc create edildiginde
        C03_StaticKeyword d = new C03_StaticKeyword();//d ogrc create edildiginde
        System.out.println("ogrcSayisi = " + ogrcSayisi);// 4

        C03_StaticKeyword e;//obj declaration var ama assiingment yok->cons call yapilmadi henuz
        System.out.println("ogrcSayisi = " + ogrcSayisi);//4
        System.out.println("a.ogrcId = " + a.ogrcId);//1
        System.out.println("b.ogrcId = " + b.ogrcId);//2
        System.out.println("c.ogrcId = " + c.ogrcId);//3
        System.out.println("d.ogrcId = " + d.ogrcId);//4

        System.out.println("Gunun sonunda ogrcSayisi = " + ogrcSayisi);//4

    }//main sonu
}
