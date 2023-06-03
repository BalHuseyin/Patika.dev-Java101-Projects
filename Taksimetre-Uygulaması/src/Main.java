import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables
        double  totalPrice , perKm = 2.20 , startPrice=10;
        int km ;

        //Getting information from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in Km :");
        km = input.nextInt();
        totalPrice  = (km * perKm) + startPrice;
        totalPrice  = (totalPrice  <20 ) ? 20 : totalPrice ;
        System.out.println("Total Price :" +totalPrice );
    }
}