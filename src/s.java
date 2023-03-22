import java.util.*;

public class s {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("Murat", "javaCAN", "javaTAR", "Abdi bey", "sefil HalUk"));
        System.out.print("Agam kime bakmistin? : ");
        String aganinAdami=input.nextLine();

        System.out.println("ll = " + ll);

        System.out.println("   *** cincig ternary code   ***   ");
        System.out.println(ll.remove(aganinAdami) ? "Agam eleman bulundu" : "Agam aradiginiz kisi listede yoktur");
        System.out.println("ll = " + ll);
    }
}


