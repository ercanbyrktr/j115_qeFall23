package day08;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        //Question 2- Get a note from the user, print "Pass the Class" if it is 50 or more, and
        // "Sorry, failed" if it is less than 50.

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your note");

        double note = scan.nextDouble();
        if (note >= 50 && note <= 100) {
            System.out.println("Pass the Class");
        }
        if (note < 50)
            System.out.println("Sorry, failed");
    }
}
