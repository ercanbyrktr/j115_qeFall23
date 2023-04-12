package day26_arrays2;

import java.util.Arrays;

public class C01_question1 {
    public static void main(String[] args) {
        //    Question 3- (Interview) Create a method that will shift all the elements in a given array to the right
        //    and move the last element to the beginning, save the array as new.
        //    Orn : input : [4,5,6,7] is the final state of the array. : [7,4,5,6]

        int[] intArr={3,4,5,6,7};
        int tempBox=intArr[intArr.length-1];

        for (int i = 0; i <intArr.length-1 ; i++) {
                intArr[intArr.length-1-i]=intArr[intArr.length-2-i];
        }
        intArr[0]=tempBox;
        System.out.println(Arrays.toString(intArr));
    }
}
