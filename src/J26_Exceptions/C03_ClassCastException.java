package J26_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {
        //ClassCastException -> birbirine donusturulemeyen data type donusturme isleminde olusan RTE verir

        Object obj = "JavaCAN`lara selamkee";
        System.out.println("obj = " + obj);
        String str = (String) obj;//obj data type string data type a casting yapildi
        System.out.println("str = " + str);

        Object sayi = 33;
        //String str1= (String) sayi;//object data type String data type a casting yapildi
        //System.out.println("str1 = " + str1);//classCastException
        try {
            String str1= (String) sayi;
            System.out.println("Agam try block calistirildi bu yazi okursan catch calismaz ");

        }catch (ClassCastException e) {

            System.out.println("Agam integer datatype string olur mu?");
            System.out.println("Bu yazyi okudu isen try exception yakaladi catch yakaladi");

        }
        try {
            String str2 = (String) obj;
            System.out.println("Agam try block calistirildi bu yazi okursan catch calismaz ");
        }catch (ClassCastException e){
            System.out.println("Agam bu print olursa try exc catch yakaladi");
        }


        System.out.println("Agam kode cincig dewamkee");
    }
}
