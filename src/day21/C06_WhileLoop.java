package day21;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // take a lot of numbers from user
        // as long as sum of these numbers is lower than 500, continue
        // at the end, print how many numbers user entered and sum of numbers

        Scanner scan=new Scanner(System.in);
        int sum=0;
        int enteredNumber=0;
        int numberOfEnteredNumber=0;

        while (sum<=500) {

            System.out.println("Please enter the number : ");

            numberOfEnteredNumber= scan.nextInt();

            sum =sum+ enteredNumber;
            numberOfEnteredNumber++;

        }
        System.out.println("Sum: "+ sum);
        System.out.println("Amout of entered number : "+numberOfEnteredNumber);
    }
}
