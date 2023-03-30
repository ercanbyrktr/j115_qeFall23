package day18;

public class C01_ForLoops {
    public static void main(String[] args) {

        //let's create a method that prints even numbers from 0 t0 until a given value

        evenNumbersMethod(56);

        //1.Way
//        int givenNumber = 56;
//
//        for(int i = 0; i<=givenNumber; i++){
//
//            if(i%2==0){
//                System.out.print(i + " ");
//
//            }
//        }


    }


        //2. way

    public static void evenNumbersMethod(int givenNumber){

        for (int i=0; i<=givenNumber; i++ ){

            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
    }
    }

