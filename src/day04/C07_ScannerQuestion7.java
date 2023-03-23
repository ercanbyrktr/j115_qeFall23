package day04;

import java.util.Scanner;

public class C07_ScannerQuestion7 {
    public static void main(String[] args) {
        //Question 6- Take the radius of a circle from the user and print its perimeter and area.
        //Kullanıcıdan bir dairenin yarıçapını alın ve çevresini ve alanını yazdırın.
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the half diameter of the circle");

        double radius= scan.nextDouble();

        System.out.println("circumference of the circle : " + 2*3.14* radius);
        System.out.println("area of the circle : " + 3.14* radius*radius);
    }
}
