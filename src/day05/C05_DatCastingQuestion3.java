package day05;

import java.util.Scanner;

public class C05_DatCastingQuestion3 {
    public static void main(String[] args) {
        //4- Take two double numbers from the user, divide the first number by the second number
        //and print the integer part of the result of the division operation.
        //kullanıcıdan iki çift sayı alın, ilk sayıyı ikinci sayıya bölün
        // ve bölme işleminin sonucunun tamsayı kısmını yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        double num1= scan.nextDouble();
        double num2= scan.nextDouble();

        int avaregeNum=(int)(num1+num2)/2;

        System.out.println(avaregeNum);

    }
}
