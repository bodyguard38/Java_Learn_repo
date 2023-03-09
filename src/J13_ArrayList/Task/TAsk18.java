package J13_ArrayList.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TAsk18 {
    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(1,3, 6, 5, 7));
        Scanner scanner = new Scanner(System.in);
        System.out.println("ilk index i giriniz: ");
        int ilkIndex = scanner.nextInt();

        System.out.println("Son index i giriniz: ");
        int sonIndex = scanner.nextInt();


        System.out.println(elemanlariDegistir(sayilar, ilkIndex, sonIndex));

    }

    private static ArrayList elemanlariDegistir(ArrayList<Integer> sayilar, int ilkIndex, int sonIndex) {

        int temp = temp=sayilar.get(ilkIndex);
        sayilar.set(ilkIndex,sayilar.get(sonIndex));
        sayilar.set(sonIndex,temp);

        return sayilar;
    }
}
