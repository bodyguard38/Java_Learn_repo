package J18_ImmotableClass;

import java.util.ArrayList;

public class C02_ImmutableClass {
    public static void main(String[] args) {
        /*
        Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
        BigDecimal, BigInteger java'da immutable->değişmez sınıflara örnek olarak gösterilebilir.
          StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
       */

        String name="Aydin";
        System.out.println("******Immutable class******");
        System.out.println("method oncesi name  :"+name);
        name.concat(" QA team leader");
        System.out.println("method sonrasi name  :"+name);//string immutable class oldugu icin ayni degeri korur.

        System.out.println("******mutable class******");
        ArrayList<String> isimList=new ArrayList<>();

        System.out.println("isimList :  "+isimList);
        isimList.add("Abdi");
        isimList.add("Ceren");
        isimList.add("Tugba");
        System.out.println("isimList :  "+isimList);//list mutable class oldugu icin method call sonrasi degisti.

    }
}
