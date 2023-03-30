package J32_Enum.Enum01;

public class Runner {
    public static void main(String[] args) {
        //Task verilen yilin ayini numarasina gore kac gun cektigini print eden code create ediniz.

        //int ay = 3;
        Aylar ay = Aylar.MART;//Aylar enum data type ay variable tanimlanip Aylar enum undan mart field call edilerek atandi
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());//MART
        System.out.println("ay.ordinal() = " + ay.ordinal());//2
        switch (ay) {
            case OCAK:
                System.out.println("ocak ayi 31 gundur");
                break;
            case SUBAT:
                System.out.println("ocak ayi 28 gundur");
                break;
            case MART:
                System.out.println("ocak ayi 31 gundur");
                break;
            case NISAN:
                System.out.println("ocak ayi 30 gundur");
                break;
            case MAYIS:
                System.out.println("ocak ayi 31 gundur");
                break;
            case HAZIRAN:
                System.out.println("ocak ayi 30 gundur");
                break;
            case TEMMUZ:
                System.out.println("ocak ayi 31 gundur");
                break;
            case AGUSTOS:
                System.out.println("ocak ayi 30 gundur");
                break;
            case EYLUL:
                System.out.println("ocak ayi 31 gundur");
                break;
            case EKIM:
                System.out.println("ocak ayi 30 gundur");
                break;
            case KASIM:
                System.out.println("ocak ayi 31 gundur");
                break;
            case ARALIK:
                System.out.println("ocak ayi 30 gundur");
                break;
            default:
                System.out.println("code cincig oldu dewamkee");
                break;
        }
    }
}
