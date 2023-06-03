import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       // Değişkenler
        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfını tanımlamak
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değer alma
        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.println("Turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Muzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.print("Not ortalamanız : " + sonuc );
        System.out.println(sonuc >= 60 ? " Sınıfı Geçtiniz" : " Sınıfta Kaldınız");
       

    }
}