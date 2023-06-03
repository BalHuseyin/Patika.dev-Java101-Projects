import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişken Oluşturma

        int a,b,c;
        int u;
        int alan;

        // Kullanıcıdan Veri Alma
        Scanner input = new Scanner(System.in);

        System.out.print("1.Kenarı Giriniz :");
        a= input.nextInt();
        System.out.print("2.Kenarı Giriniz :");
        b = input.nextInt();
        System.out.print("3.Kenarı Giriniz :");
        c = input.nextInt();

        u = (a+b+c) / 2;
        alan = (int) Math.sqrt( u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin Alanı = " +alan);

    }
}