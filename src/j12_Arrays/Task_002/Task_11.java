package j12_Arrays.Task_002;

public class Task_11 {
    public static void main(String[] args) {

        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        int dolarSum =0;
        int poundSum = 0;
        String[] strArray = str.split(" ");
        for (String s : strArray) {
            if(s.startsWith("$")){
                dolarSum += Integer.parseInt(s.substring(1));
            }else if(s.startsWith("£")){
                poundSum += Integer.parseInt(s.substring(1));
            }
        }
        System.out.println("\"Total sum of $ signs\" = " + dolarSum);
        System.out.println("\"Total sum of £ signs\" = " + poundSum);
    }
}
