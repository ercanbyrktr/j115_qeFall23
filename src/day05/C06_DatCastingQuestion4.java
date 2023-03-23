package day05;

import java.util.Scanner;

public class C06_DatCastingQuestion4 {
    public static void main(String[] args) {
        //Get a double and an integer from the user, divide the double number by the second number and print
        //the integer part of the result of the division operation.

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");

        double num1= scan.nextDouble();
        int num2= scan.nextInt();

        int avaregeNum=(int) (num1/num2);

        System.out.println(avaregeNum);
    }
}
