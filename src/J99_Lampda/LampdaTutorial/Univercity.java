package J99_Lampda.LampdaTutorial;

public class Univercity {
    private String universite;
    private String bolum;
    private int ogrcSayisi;
    private int notOrt;

    public Univercity(String bogazici, String matematik, int i, int i1) {

    }

    public void University(String universite, String bolum, int ogrcSayisi, int notOrt) { //fuul parameter telescopıc cons.
        this.universite = universite;
        this.bolum = bolum;
        this.ogrcSayisi = ogrcSayisi;
        this.notOrt = notOrt;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrcSayisi() {
        return ogrcSayisi;
    }

    public void setOgrcSayisi(int ogrcSayisi) {
        this.ogrcSayisi = ogrcSayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return
                "universite = '" + universite + '\'' +
                        ", bolum = '" + bolum + '\'' +
                        ", ogrcSayisi = " + ogrcSayisi +
                        ", notOrt = " + notOrt;
    }
}
