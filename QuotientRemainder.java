import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        double num = sc.nextDouble();

        System.out.print("Enter Divisor: ");
        double div = sc.nextDouble();

        if (div == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            double quo = num / div;
            double rem = num % div;

            System.out.println("Quotient: " + quo);
            System.out.println("Remainder: " + rem);
        }

        sc.close();
    }
}