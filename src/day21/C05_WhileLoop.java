package day21;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //print all even numbers from 50-100 with the while loop
        int number=50;

        while (number<=100) {
            if (number % 2 == 0) {
            System.out.print(number + " ");

            }
            number++;
        }
    }
}
