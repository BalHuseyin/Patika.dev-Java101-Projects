import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvOranv1 = 0.18, kdvOranv2 = 0.08 ,kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz :");
        tutar = input.nextDouble();

        kdvTutar = tutar <= 1000 ? kdvOranv1 * tutar : kdvOranv2 * tutar ;
        kdvliTutar = tutar + kdvTutar;


        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Tutarı :" + kdvTutar );
        System.out.print("Kdv Oranı :");
        System.out.println( tutar<=1000 ? +  kdvOranv1  : kdvOranv2  );
        System.out.println("KDV'li Tutar : " +kdvliTutar);
    }
}