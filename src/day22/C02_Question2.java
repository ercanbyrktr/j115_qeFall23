package day22;

import java.util.Scanner;

public class C02_Question2 {
    public static void main(String[] args) {
        //Question 1- Let's take a positive integer from the user and find the sum of the digits
        //            with the while loop
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();

        int sum = 0;
        int remainder=0;

        while (num!= 0) {

            remainder=num % 10;
            sum = sum + remainder;//this one always gives the last digit
            num = num/10;

        }

        System.out.println("Sum of the digits: " + sum);


        //length of a number 12043 => length is 5

        int number = 12359;
        String numberToString = ""+number;
        numberToString.length();


    }
}

