package j12_Arrays.Task_001;

public class Task_06 {
    public static void main(String[] args) {
        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..
        String fruit[] = {"Apple", "Orange", "Banana", "Pineapple"};

        boolean found= false;

        for(String s : fruit) {
            if (s.equals("Apple")) {
                found = true;
                break;
            }
        }
            System.out.println(found);
    }
}
