package day04;

import java.util.Scanner;

public class C04_ScannerQuestion4 {
    public static void main(String[] args) {
        //Question 4- Take the length of 2 sides of a rectangle from the user
        // and print the area of the rectangle

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the width of rectangle");
        double width= scan.nextDouble();

        System.out.println("please enter the length of rectangle");
        double length= scan.nextDouble();

        double areOfRectangle=width*length;

        System.out.println(areOfRectangle);


    }
}
