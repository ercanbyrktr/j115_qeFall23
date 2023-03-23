package day08;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        //print if a given number is even or odd number
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= scan.nextInt();
        boolean divisibilityCheck=num%2==0;

        if (divisibilityCheck){
            System.out.println(num+"is an even number");
        }else {
            System.out.println(num+" is an odd number");
        }
    }
}
