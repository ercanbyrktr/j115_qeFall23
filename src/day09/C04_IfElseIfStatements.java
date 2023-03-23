package day09;

import java.util.Scanner;

public class C04_IfElseIfStatements {
    public static void main(String[] args) {
        // Question 1- Get the gender and age from the user.
        // Female, 60 years old and over, Male 65 years and older can retire.
        // Print “You can retire” or
        // “You need to work .. more years to retire”, taking into account gender and age.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your gender");
        char gender = scan.next().toUpperCase().charAt(0);
        System.out.println("please enter age");
        double age = scan.nextDouble();

        if ((gender == 'F' && age >= 60) || (gender == 'M' && age >= 65)) {
            System.out.println("You can retire");

        } else if (gender == 'F') {
            System.out.println("You need to workn " + (60 - age) + " more years to retire");
        } else if (gender == 'M') {
            System.out.println("You need to work " + (65 - age) + " more years to retire");

        }
    }
}
