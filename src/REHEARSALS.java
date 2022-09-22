import java.util.Scanner;

public class REHEARSALS {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int number1 = myScanner.nextInt();
        System.out.println(" ");
        System.out.println("Enter second integer: ");
        int number2 = myScanner.nextInt();
        int sum = 0;
        int product = 0;
        int difference = 0;
        double quotient = 0;
        System.out.println(" ");
        System.out.println("Results");

        System.out.print("Sum: ");
        System.out.println(sum = number1 + number2);
        System.out.print("product: ");
        System.out.println(product = number1*number2);
        System.out.print("difference: ");
        System.out.println(difference = number1-number2);
        System.out.print("quotient: ");
        System.out.println(quotient = number1/number2);



    }
}
