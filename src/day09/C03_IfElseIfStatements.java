package day09;

import java.util.Scanner;

public class C03_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your grade");
        int grade= scan.nextInt();
        
        if (grade>=85){
            System.out.println("AA");
        } else if (grade>=65) {
            System.out.println("BB");
        }else if (grade>=50){
            System.out.println("CC");
        }else if(grade>=0) {
            System.out.println("DD");
        }else {
            System.out.println("Hey user! Please enter a positive number");
        }
    }
}
