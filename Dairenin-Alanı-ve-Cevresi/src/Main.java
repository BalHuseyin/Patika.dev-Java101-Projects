import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle :");
        r = input.nextInt();

        double area = pi * r * r;
        double env = 2 * pi * r;

        System.out.println("Area of the circle : " + area);
        System.out.println("The circumference of the circle : " + env);
    }
}