public class Musteri {
    private String ad;
    private String soyad;
    private Siparis[] siparisler;

    public Musteri(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        siparisler = new Siparis[3];
        for(int i=0;i<siparisler.length;i++)
            siparisler[i] = new Siparis();
    }


    public void siparisVer(int no, Urun u) {
        siparisler[no].urunEkle(u);
    }

    public void tumSiparisler() {
        System.out.println(ad+" "+soyad+" isimli müşteriye ait sipariş bilgileri:");
        for(int i=0;i<siparisler.length;i++){
            siparisBilgisi(i);
        }
    }

    public void siparisBilgisi(int no) {
        System.out.println(no+" nolu siparişe ait ürün bilgileri:");
        siparisler[no].urunleriGoster();
    }

    public void kacSiparis(String urunAdi) {
        int urunSay = 0, siparisSay=0 ;
        for(int i=0;i<siparisler.length;i++){
            int flag=0;
            for(Urun iter:siparisler[i].getUrunler()){
                if(iter!=null){
                    if(iter.getAd().compareTo(urunAdi)==0){
                        urunSay++;
                        flag++;
                        if(flag==1)
                            siparisSay++;

                    }

                }
            }
        }
        System.out.println(siparisSay +" tane sipariş içinde toplam "+ urunSay+" adet "+urunAdi+ " sipariş edilmiş."  );
    }

    public void tumSiparislerdenurunCikar(Urun urun) {
        for(int i=0;i<siparisler.length;i++){
            siparisler[i].urunCikar(urun);
        }
    }

    public void urunCikar(int siparisNo, Urun urun) {
        siparisler[siparisNo].urunCikar(urun);
    }

    public double getSiparisTutari(int siparisNo){
        return siparisler[siparisNo].getToplamTutar();
    }
}
