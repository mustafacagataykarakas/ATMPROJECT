package tr.com.mustafacagataykarakas.atm.model;

public class KurumsalMusteri extends Musteri{

    private String sirketAdi;

    public KurumsalMusteri(String tcKimlikNo, String adSoyad, Double hesapBakiyesi, String sirketAdi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    @Override
    public String toString() {
        return "Kurumsal Musteri Bilgileri : " +
                "\n sirketAdi='" + sirketAdi + '\'' +
                ",\n tcKimlikNo='" + tcKimlikNo + '\'' +
                ",\n adSoyad='" + adSoyad + '\'' +
                ",\n hesapBakiyesi=" + hesapBakiyesi;
    }
}
