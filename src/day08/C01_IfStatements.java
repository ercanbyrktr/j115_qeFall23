package day08;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {

        //if (condition){action depends on the condition is true}

        int num1 = 10;
        int num2 = 20;

        if (num1 < num2) {
            System.out.println("number1 is smaller than number2");//it will print the body since condition is true
        }
        if (num1 > num2) {
            System.out.println("number1 is smaller than number2");//it won't print the pody since the condition is false

        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user!,Please enter a number");
        int num = scan.nextInt();
        boolean divisibilityCheck=num%5==0;


        if (divisibilityCheck) {
            System.out.println(num+"Number a multiple of 5");
        }
        //"Process finished with exit code 0" means execution is succesfully completed
    }
}
