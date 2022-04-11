public class Urun {
    private final int ID;
    private String ad;
    private double fiyat;
    private static int zamSayisi;  //default value: 0

    public Urun(int ID, String ad, double fiyat) {
        this.ID = ID;
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public int getID() {
        return ID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getFiyat() {
        return fiyat;
    }


    public static int getZamSayisi() {
        return zamSayisi;
    }

    public void zamYap(double oran) {
        fiyat += fiyat*oran;
        zamSayisi++;

    }

    @Override
    public String toString() {
        return "Urun [id=" + ID + ", ad=" + ad + ", fiyat=" + fiyat + "]";
    }
}
