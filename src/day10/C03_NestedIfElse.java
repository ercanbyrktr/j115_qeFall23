package day10;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
         /*
         Question 1- Get the gender and age from the user. Female, 60 years old and over,
         Men 65 years and older can retire. Print “You can retire” or “You need to work .. more years to retire”,
         taking into account gender and age.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("hey use! Please enter your age");
        int age = scan.nextInt();

        System.out.println("Please enter your gender as Female:F , Male:M");
        char gender = (scan.next().toUpperCase().charAt(0));

        if (age < 0 || age > 150) {
            System.out.println("Invalid age");
        } else if (age < 60) {
            if (gender == 'F') {
                System.out.println("You need to work" + (60 - age) + " more years to retire");
            } else if (gender == 'M') {
                System.out.println("You need to work" + (65 - age) + " more years to retire");
            } else {
                System.out.println("Invalid gender");
            }
        } else if (age < 65) {
            if (gender == 'F') {
                System.out.println("You are retired");
            } else if (gender == 'M') {
                System.out.println("You need to work" + (65 - age) + " more years to retire");
            } else {
                System.out.println("Invalid gender");
            }
        }else {
            System.out.println("You can retired");
        }
    }
}
