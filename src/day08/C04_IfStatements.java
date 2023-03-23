package day08;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {
        //  - Ask the user's age, print "You can retire" if he is 65 years or older, otherwise print the number of years he has to work to retire
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int age = scan.nextInt();
        int retiremntAge = 65;

        if (age >= retiremntAge) {

            System.out.println("Hey men. You are retired");
        }
        if (age < retiremntAge) {
            System.out.println("You need to work " + (65 - age) + "more year");
        }
    }
}
