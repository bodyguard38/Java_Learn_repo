package J26_Exceptions;

public class C05_ArrayIndexOutOfBoundException {
    public static void main(String[] args) {


    //ArrayIndexOutOfBoundException  -> arraylerde olmayan index elemani ile islem yap. olusan RTE
    int sayi1[] = {33, 58, 31, 43, 21,63};
        System.out.println("sayi1[5] = " + sayi1[5]);//63

        //System.out.println("sayi1[12] = " + sayi1[12]);//rte
        try {
            System.out.println("sayi1[12] = " + sayi1[12]);
            System.out.println("Agam bu satiri okudu ise code exception firlatmadi");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()+"Agam olmayan eleman isttiseennn");
            System.out.println("Agam bu satiri okudu ise code exception firlatti ama handle ettik");
        }

        System.out.println("Agam code sona kadar geldi dewam keee");
    }
}
