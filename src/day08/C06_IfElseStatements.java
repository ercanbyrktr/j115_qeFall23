package day08;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        //Homework: Question 4- Ask the user to enter a character,
        // print whether the entered character is uppercase or not.

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a character");
        char chr = scan.next().charAt(0);
        if ('A' <= chr && chr <= 'Z') System.out.println("uppercase letter");
        if (!('A' <= chr && chr <= 'Z')) {
            System.out.println("not uppercase letter.");

        }
    }
}
