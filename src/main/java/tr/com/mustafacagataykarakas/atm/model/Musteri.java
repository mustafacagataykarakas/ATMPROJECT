package tr.com.mustafacagataykarakas.atm.model;

public class Musteri {

    String tcKimlikNo;
    String adSoyad;
    Double hesapBakiyesi;

    public Musteri(String tcKimlikNo, String adSoyad, Double hesapBakiyesi) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public Double getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void paraYatir(Double tutar){
        this.hesapBakiyesi = this.hesapBakiyesi + tutar ;
    }

    public Double paraCek(Double tutar){
        this.hesapBakiyesi = this.hesapBakiyesi - tutar ;
        return this.hesapBakiyesi;
    }

    @Override
    public String toString() {
        return "Musteri Bilgileri :" +
                "\n tcKimlikNo='" + tcKimlikNo + '\'' +
                ",\n adSoyad='" + adSoyad + '\'' +
                ",\n hesapBakiyesi=" + hesapBakiyesi;
    }
}
