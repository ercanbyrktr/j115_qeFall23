package day29_ArrayList2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_TakeNamesFromUserMethod {
    public static void main(String[] args) {
        // Create a method
        // it will take names from user and create a list from them
        //when user enters q exit and print

        System.out.println(creatingListFromUser());
    }
    public static List<String> creatingListFromUser(){
        //We will create the variable outside of the while loop
        List<String>names=new ArrayList<>();
        String enteredName="";
        Scanner scan=new Scanner(System.in);

        while (!enteredName.equalsIgnoreCase("q")) {
            System.out.println("please enter a name or press Q to print the list");
            enteredName= scan.nextLine();

            if (!enteredName.equalsIgnoreCase("q")) {
                names.add(enteredName);
            }
        }

        return names;

    }
}
