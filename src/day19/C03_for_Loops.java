package day19;

import java.util.Scanner;

public class C03_for_Loops {
    public static void main(String[] args) {
        //Question 7- Get a positive integer from the user and print the sum of the digits.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();

        int sum = 0 ;

        for(int i = num; i!=0; num = num/10){

            i = num%10;
            sum = sum + i;

        }

        System.out.println(sum);


    }
}
