package day21;

import day19.C02_for_Loops;

import java.util.Scanner;

public class C01_Question_method_overload {
    public static void main(String[] args) {
        // use the method from day19 to reverse strings and check if it is a (palindrome madam)
        // take a string from user and check if it is a palindrome
        // use the method from day19 to reverse strings and check if it is a (palindrome madam)
        // take a string from user and check if it is a palindrome

        String input = "Java is good";
        String output="";

        for (int i = input.length()-1; i >=0 ; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);
    }
}
