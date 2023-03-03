package J20_Constructor;

public class C04_TeacherRunner {//class level
    public static void main(String[] args) { //main level

       C04_Teacher ogrt1 = new C04_Teacher("bahtiyar", "javacan", "java", 1905, 21, 8500, "evet");//parametresiz defoult cons ile
       ogrt1.ad="haluk";
       ogrt1.soyad="Bilgin";
       ogrt1.brans="Java back dev";
       ogrt1.maas=4000;
       ogrt1.tecrube=11;
        System.out.println("ogrt1 = " + ogrt1);//ref degeri

        C04_Teacher cincixOgrt=new C04_Teacher("bahtiyar","javaCAN","java",1905,3,8500,"emekli");

        System.out.println("cincixOgrt = " + cincixOgrt);
    }//main level
}//class level
