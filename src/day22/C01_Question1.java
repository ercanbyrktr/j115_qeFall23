package day22;

import java.util.Scanner;

public class C01_Question1 {
    public static void main(String[] args) {
        //Question 2- Get the user's name and surname separately in the main method
        // Create a method that returns:
        // first letters of first and last name as capitals and rest should be in lower case
        // input : name : Ali    surname :YILMAZ
        // output : Ali Yilmaz
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your first name");
        String firstName=scan.next();

        System.out.println("please enter your first name");
        String lasttName=scan.next();

        System.out.println(nameConverter(firstName,lasttName));

    }
    public static String nameConverter(String firstName, String lastName){

        String outPut=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase()+" "+
                      lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        return outPut;

    }
}
