package day09;

import java.util.Scanner;

public class C05_IfElseIfStatements {
    public static void main(String[] args) {
        //Question 2- Ask for the user's weight (kg) and height (cm)
    // and calculate the body mass index (weight * 10000 / (height * height))
        // if the body mass index is greater than 30 obese,
        // between 25-30 overweight, between 20-25 normal,
        // if less than 20 print thin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your weight as (kg)");
        int weight= scan.nextInt();

        System.out.println("please enter your height as (cm):");
        int height= scan.nextInt();
        height=height/100;

        int bmiRatio=weight*1000/(height*height);

        if (bmiRatio>=30){
            System.out.println("obese");
        } else if (bmiRatio>=25) {
            System.out.println("overweight");
        } else if (bmiRatio>=20) {
            System.out.println("normal");
        }else {
            System.out.println("thin");
        }

    }

}
