package day03;

import java.util.Scanner;

public class C05_Answers2 {
    public static void main(String[] args) {
        /*
       // Question 2- Get a letter from the user, print it if there is a month that starts with a letter.
        // NOTE: No uppercase or lowercase sensitivity. When the user types j or J, output is Jan.
        //Soru 2- Kullanıcıdan bir harf alın, harfle başlayan bir ay varsa yazdırın.
          //      NOT: Büyük veya küçük harf hassasiyeti yoktur. Kullanıcı j veya J yazdığında, çıktı Ocak olur.


        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter: ");

        char firstLetter=scan.next().charAt(0);
        firstLetter=Character.toUpperCase(firstLetter);

        if (firstLetter=='J'){
            System.out.println("January,June or July");
        } else if (firstLetter=='F') {
            System.out.println("February");
        } else if (firstLetter=='M') {
            System.out.println("March or May");
        } else if (firstLetter=='A') {
            System.out.println("April or August");
        } else if (firstLetter=='O') {
            System.out.println("October");
        }else if(firstLetter=='S'){
            System.out.println("September");
        } else if (firstLetter=='D') {
            System.out.println("December");
        } else if (firstLetter=='N') {
            System.out.println("November");
        }else {
            System.out.println("invalid letter");
        }


    }
}
