package day09;

import java.util.Scanner;

public class C01_question {
    public static void main(String[] args) {
        //Question 5- Ask the user for a letter,
        // if the entered character is lowercase, print it in uppercase, otherwise print the entered letter
        Scanner scan=new Scanner(System.in);
        System.out.println("Hey, user! please enter a chracter");
        char chr=scan.nextLine().charAt(0);

        if (chr>=65&&chr<=90){
            System.out.println("Yes, It is an uppercase character");
        }else {
            System.out.println("It is not uppercase");
        }

        System.out.println(chr+0);



    }
}
