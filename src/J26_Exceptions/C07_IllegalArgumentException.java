package J26_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException {
    public static void main(String[] args) {
    /*
    ahan da TRİCK kosesinde bugun :)

        "throw" - throws" farkları
    1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
        "throw" -> method body içinde tanımlanır.
    2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
        "throw" -> keywordden sonra sadece bir tane exception tanımlanır
    3- "throws" -> keywordden sonra sadece exception class name yazılır
        "throw" ->  keywordden sonra exception obj tanımlanır
    4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
        "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
    */


    // IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
    // ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girile değer için excp fırlatması için kullanılır..

        Scanner input = new Scanner(System.in);
        System.out.println("Yasinizi giriniz  : ");
        int yas= input.nextInt();

        try {
            if (yas < 18) {
                throw new IllegalArgumentException("Bu yasta nasil ehliyet alacan gadasini aldigim");
            }else System.out.println("Agam ehliyet alacak yastasin bir tur verirsin ");

            System.out.println("Agam bu satırı okuduysan code exception fırlatmadi");
        }catch (IllegalArgumentException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("Agam ne yaptin bu yasta ehliyet mi alinir.. ");
            System.out.println("Agam bu satırı okuduysan code exception fırlattı ama handle ettik");
        }
        System.out.println("AGAM bu printi okuduysan app. gayet başarılı dewamkeee");
        }

    }

