import java.util.Scanner;

public class circular_arithmetics {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input radius: ");
        double radius = myScanner.nextDouble();
        System.out.println(" ");
        double diameter = 0;
        double circumference = 0;
        double area = 0;
        System.out.print("Diameter: ");
        System.out.println(2*radius);
        System.out.println(" ");
        System.out.print("Circumference: ");
        System.out.println(2*Math.PI*radius);
        System.out.println(" ");
        System.out.print(" Area: ");
        System.out.println(Math.PI*Math.pow(radius, 2));


    }

}
