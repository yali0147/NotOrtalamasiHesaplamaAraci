import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        Matematik = inp.nextDouble();
        System.out.print("Fizik Notunuz : ");
        Fizik = inp.nextDouble();
        System.out.print("Kimya Notunuz : ");
        Kimya = inp.nextDouble();
        System.out.print("Türkçe Notunuz : ");
        Turkce = inp.nextDouble();
        System.out.print("Tarih Notunuz : ");
        Tarih = inp.nextDouble();
        System.out.print("Müzik Notunuz : ");
        Muzik = inp.nextDouble();

        double Toplam = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik);
        double sonuc = Toplam / 6.0;
        System.out.println("Not Ortalamanız : " + sonuc);
        String gecer = (sonuc >= 60) ? "Sınıfı Geçti" : "Sınıfta kaldı";
        System.out.println(gecer);
    }
}