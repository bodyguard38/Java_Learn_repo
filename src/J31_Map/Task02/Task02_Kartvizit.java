package J31_Map.Task02;

public class Task02_Kartvizit {
    //fields
    String  isim;
    String  email;
    String  adres;
    String telefon;
    public static int id=100;
    //construct


    public Task02_Kartvizit(String isim, String email, String adres, String telefon) {
        this.isim = isim;
        this.email = email;
        this.adres = adres;
        this.telefon = telefon;
        this.id++;
    }
    //toString

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                        ", email='" + email + '\'' +
                        ", adres='" + adres + '\'' +
                        ", telefon='" + telefon + '\'';
    }
}
