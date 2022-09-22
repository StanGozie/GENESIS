import java.util.Scanner;

public class ARITHMETICS {

    /** this file is to solve basic arithmetics in java.
     * it will involve the use of the scanner object to
     * take inputs from user, which would be analyzed and
     * printed out on the screen.
     */

    public static void main(String[] args) {
        System.out.println("BODY MASS INDEX (BMI) CALCULATOR");
        System.out.println(" ");
        System.out.println("Am I obese? \n\nYou're not sure, right?. \n\nCheck your BMI now.");
        System.out.println(" ");  //this line of code creates a line space between the line above and the one below.
        Scanner inputFromUser = new Scanner(System.in);

        /** the line above is a command to the program that
         you are importing a scanner object to take input
         from the user. the scanner name is 'inputFromUser'.
         */

        System.out.println("Enter your name: ");

        String name = inputFromUser.nextLine();
        System.out.println(" ");
        System.out.println("Welcome, "+name + "!");
        System.out.println(" ");

        System.out.println("Enter your weight in kilogram: ");
        /** the line above prompts the user to take
         * the necessary action of typing in their weight.
         */
        double weight = inputFromUser.nextDouble();

        System.out.println("Enter your height in meters: ");
        /** after the user enters their weight,
         * the program prompts them further to enter their height!
         */
        double height = inputFromUser.nextDouble(); /** this line tell the
         computer to record the user input above as height.
         it also informs the program of what type of data type the user
         will enter or input, hence the declaration "double".*/

        double BMI = (weight / (Math.pow(height, 2)));

        System.out.println("Your BMI is: " + BMI);
        System.out.println(" "); /*this line makes a line separation
        between one line and another in this program as would
        be seen by the user*/
        if (BMI <= 18) {
            System.out.println("You are underweight!");
        } else if (BMI >= 18.1 && BMI <= 24.5) {
            System.out.println("Congratulations! Your BMI is normal/healthy.");
        } else if (BMI >= 24.6 && BMI <= 30) {
            System.out.println("Ouch! You're overweight.");
        } else {
            System.out.println("You're obese!");
        }

        System.out.print("*");
        System.out.print("***");
        System.out.print("*****");
        System.out.print("****");
        System.out.print("**");




    }
}

