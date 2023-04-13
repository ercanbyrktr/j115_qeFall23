package day26_arrays2;

import java.util.Arrays;

public class C04_AddingElementsWithMethod {
    public static void main(String[] args) {
        int[] testArray={5,67,89,4,12};
        int valueToAdd=100;

        testArray=addingNewElement(testArray,valueToAdd);

        System.out.println(Arrays.toString(testArray));

    }
    public static int[] addingNewElement(int[] intArr, int valueToAdd){

        int[] newArr=new int[intArr.length+1];

        for (int i = 0; i < intArr.length-1 ; i++) {
            newArr[i]=intArr[i];
        }
        newArr[newArr.length-1]=valueToAdd;


        return intArr;
    }
}
