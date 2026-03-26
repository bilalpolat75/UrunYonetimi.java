import java.util.Scanner;
//3 nesnesi olan kullanıcıdan veri alan hesap özeti çıkaran program
// 1000 birim alısveris üstünde indirim hakkı veriyor
public class Main{
    public static void main(String[] args){
        //degisken tanimlamaları
        int kalemadet , defteradet , silgiadet;
        int silgitoplam , deftertoplam , kalemtoplam,geneltoplam;
        //nesne tanımlamaları
        Urunler kalem = new Urunler(10);
        Urunler defter = new Urunler(25);
        Urunler silgi = new Urunler(5);
        Scanner klavye = new Scanner(System.in);
        //çıktı ekranı icin gerekli kodlar
        System.out.println("1. ürün için bilgileri giriniz:");
        System.out.println("ürün adı kalem");
        System.out.println("Birim fiyat: " + kalem.fiyat);
        System.out.print("Adet: ");
        kalemadet = klavye.nextInt();
        System.out.println("2. ürün için bilgileri giriniz:");
        System.out.println("ürün adı defter");
        System.out.println("Birim fiyat: " + defter.fiyat);
        System.out.print("Adet: ");
        defteradet = klavye.nextInt();
        System.out.println("3. ürün için bilgileri giriniz:");
        System.out.println("ürün adı silgi");
        System.out.println("Birim fiyat: " + silgi.fiyat);
        System.out.print("Adet: ");
        silgiadet = klavye.nextInt();
        //nesnelerin toplam hesabı icin atamalar
        kalemtoplam = kalemadet * kalem.fiyat;
        silgitoplam = silgiadet * silgi.fiyat;
        deftertoplam = defteradet * defter.fiyat;
        System.out.println("--- SİPARİŞ ÖZETİ ---");
        System.out.println("Ürün: Kalem");
        System.out.println("adet: " + kalemadet);
        System.out.println("Satır tutarı: " + kalemtoplam);
        System.out.println("--------------------------");
        System.out.println("Ürün: Defter");
        System.out.println("adet: " + defteradet);
        System.out.println("Satır tutarı: " + deftertoplam);
        System.out.println("--------------------------");
        System.out.println("Ürün: Silgi");
        System.out.println("adet: " + silgiadet);
        System.out.println("Satır tutarı: " + silgiadet);
        System.out.println("--------------------------");
        // alınan bütün ürünlerin birim fiyat toplamı
        geneltoplam = silgitoplam + kalemtoplam + deftertoplam;
        System.out.println("Genel toplam: " + geneltoplam);
        if (geneltoplam >= 1000){
            System.out.println("indirim uygulanabilir");
        }
        else{
            System.out.println("indirim uygulanamaz");
        }
        klavye.close();

    }
}
