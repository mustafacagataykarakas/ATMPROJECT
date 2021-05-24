package tr.com.mustafacagataykarakas.atm.main;

import tr.com.mustafacagataykarakas.atm.model.BireyselMusteri;
import tr.com.mustafacagataykarakas.atm.model.KurumsalMusteri;
import tr.com.mustafacagataykarakas.atm.model.Musteri;

import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        HashMap<String, Musteri> hesapBilgileri = new HashMap<String, Musteri>();
        hesapBilgileri.put("99550909", new BireyselMusteri("90909099005", "Çağatay Ulusoy", 1290.5, "İstanbul"));
        hesapBilgileri.put("59092090", new BireyselMusteri("90909099009", "Kıvanç Tatlıtuğ", 1295.5, "İstanbul"));
        hesapBilgileri.put("55555555", new KurumsalMusteri("90909099008", "Demet Akalın", 9012.5, "Demet Akalın Group"));
        hesapBilgileri.put("09099302", new KurumsalMusteri("90909099004", "Hande Yener", 80120.5, "Hande Kozmetik"));
        hesapBilgileri.put("91209210", new KurumsalMusteri("90909099000", "Sezen Aksu", 99120.5, "Sezen Aksu Holding"));

        Boolean running = true;
        Scanner scan = new Scanner(System.in);

        while(running){
            System.out.println("Müşteri Numaranız: ");
            String musteriNo = scan.next();
            Musteri hesap = hesapBilgileri.get(musteriNo);
            System.out.println(hesap.toString());

            System.out.println("İşlem Tipi: " +
                    "\n(1: Para Yatırma)" +
                    "\n(2: Para Çekme) " +
                    "\n(3: Çıkış)");

            int islemNo = scan.nextInt();
            Double tutar = 0.0;

            switch (islemNo){
                case 1:
                    tutar = tutarAl(scan);
                    hesap.paraYatir(tutar);
                    System.out.println(hesap.toString());
                    break;
                case 2:
                    tutar = tutarAl(scan);
                    hesap.paraCek(tutar);
                    System.out.println(hesap.toString());
                    break;
                case 3:
                    running = false;
                    System.out.println("Teşekkürler");
                    break;
                case 4:
                    System.out.println("Geçersiz islem tipi!");
                    break;
            }
        }
    }
    public static Boolean tutariKontrolEt(Double tutar) {
        if(tutar <= 0){
            return false;
        }
        return true;
    }

    public static Double tutarAl(Scanner scan){
        System.out.println("Tutar: ");
        Double tutar = scan.nextDouble();
        while(!tutariKontrolEt(tutar)){
            System.out.println("Lütfen geçerli tutar giriniz!");
            tutar = scan.nextDouble();
        }
        return tutar;
    }
}
