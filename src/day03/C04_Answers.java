package day03;

import java.util.Scanner;

public class C04_Answers {
    public static void main(String[] args) {
        //Question 1- Ask the user for a number, check the number and print “Number a multiple of 5” if it is divisible by 5.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");

        int num=scan.nextInt();


        System.out.println("5 times the number: "+(num % 5 == 0));

    }
}
