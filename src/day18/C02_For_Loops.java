package day18;

public class C02_For_Loops {
    public static void main(String[] args) {
        //Question 2- Create a method for below question
       // print numbers divisible by 7 from 1 to the entered number (including the entered number).

        divisibleBySeven(287);

    }

    public static void divisibleBySeven(int givenNumber){

        for(int i = 1; i<=givenNumber; i++){

            if(i%7==0){
                System.out.print(i + " ");
            }

        }
    }
}
