package J13_ArrayList.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
         /* TASK :
        Bir integer list oluşturunuz ve bu list'deki tum sayıların karesinin
        toplamını bulan code create ediniz.
        */

        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("liste atamak icin sayi giriniz \n agam yeter diyorsan'q' gir");
        String listSayilari="" ;

        while (!listSayilari.equalsIgnoreCase("q")){
            System.out.println("Lutfen sayi giriniz    : ");
            listSayilari = scan.nextLine();
            list.add(listSayilari);

        }
        System.out.println("list = " + list);
        list.remove(list.size()-1);
        System.out.println("q silinmis hali : " + list);
        int toplam = 0;
        for (int i = 0; i < list.size(); i++) {
            toplam+=Integer.parseInt(list.get(i))*Integer.parseInt(list.get(i));
        }
        System.out.println("Agam girdigin sayilar toplami "+toplam);
    }
}
