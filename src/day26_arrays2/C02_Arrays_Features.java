package day26_arrays2;

import java.util.Arrays;

public class C02_Arrays_Features {
    public static void main(String[] args) {
        int[] intArr={1,2,3,4,5};//length 5

        int[] intArr2=new int[5];//Creating an array with a specific length

        //***Arrays are fixed in length
        //intArr={1,2,3,4,6};//It is complaining because initial length is 5

        int[] intArray3={9,8,7,6,5};

        intArr=intArray3;

        System.out.println(Arrays.toString(intArr));


    }
}
