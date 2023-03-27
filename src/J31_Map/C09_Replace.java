package J31_Map;

import java.util.HashMap;

public class C09_Replace {
    public static void main(String[] args) {

        //map.replace();-> girilen value degeri ilgili key de update edilip update oncesi eski value return edilir

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");

        System.out.println("hm replace oncesi= " + hm);
        System.out.println("hm.replace(\"Amazon\",\"99 euro\") = " + hm.replace("Amazon", "99 euro"));
        System.out.println("hm replace sonrasi= " + hm);
        System.out.println("hm.replace(\"olmayan\", \"javaNUR\") = " + hm.replace("olmayan", "javaNUR"));
        //map de olmayan key icin null return eder

    }
}
