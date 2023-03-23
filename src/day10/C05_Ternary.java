package day10;

import java.util.Scanner;
// take a positive number from user
// if it is an even number, print "even number"
// if it is not print "odd number"
public class C05_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a positive number");

        int num= scan.nextInt();
        System.out.println( num%2==0 ? "Even number" : "odd number");

    }
}
