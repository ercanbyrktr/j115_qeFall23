package day25_Arrays;

import java.util.Arrays;

public class C02_IncreaseAllElements {
    public static void main(String[] args) {

        int[]testArray={1,2,3,4};

        int[]updatedTestArray=increaseAllElementOfArray(testArray,3);

        System.out.println(Arrays.toString(updatedTestArray));

    }

    public static int[]increaseAllElementOfArray(int[] intArray,int changeAmount) {



        for (int i = 0; i < intArray.length-1; i++) {   //intArray.length-1 last index of an array

            intArray[i]=intArray[i]+changeAmount;
        }

        return intArray;
    }

}
