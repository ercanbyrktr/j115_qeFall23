package day14;

import java.util.Scanner;

public class C01_question {
    public static void main(String[] args) {
        /*
        QUESTION : get a mail from the user
- if the mail does not contain @, print "invalid mail"
- if the mail does not contain @gmail.com, "mail must be gmail"
- if the mail does not end with @gmail.com , print "there is a typo in the mail"
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your email adress:");

        String email=scan.nextLine();
        if (!email.contains("@")){
            System.out.println("invalid mail");

        }else if (!email.contains("@gmail.com")){
            System.out.println("mail must be gmail ");
        }else if (!email.endsWith("@gmail.com")){
            System.out.println("there is a typo in the mail.");
        }
    }
}
