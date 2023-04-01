package day20;

import java.util.Scanner;

public class C01_for_Loops {
    public static void main(String[] args) {
       //create a method that takes a string and adds star between the characters and returns a string.
        // exp:Convert "Java" to "J*a*v*a"

        Scanner scan= new Scanner(System.in);
        String word = scan.nextLine();

        add1(word);

    }
    public static String add1 (String word) {

        for(int i=0; i<word.length(); i++) {

            if(i==word.length()-1) {
                System.out.println(word.charAt(i));
            }else
                System.out.print(word.charAt(i) + " * ");


        }

        return word;

    }
}
