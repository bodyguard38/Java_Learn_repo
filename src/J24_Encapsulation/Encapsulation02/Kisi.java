package J24_Encapsulation.Encapsulation02;

public class Kisi {//pojo Class
    /* task
    Kisi pojo class için fields-> ad, soyad, password(String), yas
    tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
    (password encapsulated update edilmemeli.)
    yas variable negatif değer girmeye karsı encapsulated

    runner class'da obj ile field ları print eden code create ediniz
     */
    //1-fields

    private String ad;
    private String soyad;
    private String password;
    private int yas;

    //2->constructor

    public Kisi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        this.yas = yas;
       // setYas(yas);//parametre yas setYas meth call edildi
    }

    //3->getter setter method

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getPassword() {
        return password;
    }

    public int getYas() {
        return Math.abs(yas);
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);// parametre olarak gelen yas variable
    }

    //4->toString method

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", password='" + password + '\'' +
                ", yas=" + yas +
                '}';
    }
}//class sonu
