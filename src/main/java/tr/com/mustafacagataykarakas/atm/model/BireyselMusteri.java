package tr.com.mustafacagataykarakas.atm.model;

public class BireyselMusteri extends Musteri{

    private String evAdresi;

    public BireyselMusteri(String tcKimlikNo, String adSoyad, Double hesapBakiyesi, String evAdresi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.evAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public String toString() {
        return "Bireysel Musteri Bilgileri : " +
                "\n evAdresi='" + evAdresi + '\'' +
                ",\n tcKimlikNo='" + tcKimlikNo + '\'' +
                ",\n adSoyad='" + adSoyad + '\'' +
                ",\n hesapBakiyesi=" + hesapBakiyesi;
    }
}
