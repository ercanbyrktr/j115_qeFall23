package day31_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_FindingCoomonElements {
    public static void main(String[] args) {
        // Question 5- Write a program that compares the elements of the two given arrays
       // and returns the elements common to both of them as a separate list.
        //use for each

        int[] arr1={2,3,6,7};
        int[] arr2={3,9,6,3};
        commonElements(arr1,arr2);

    }
    public static void commonElements(int[]arr1, int[]arr2){

        List<Integer> commonList=new ArrayList<>();//[]

        for (Integer each1:arr1) {
            for (Integer each2 : arr2) {

                if (each1 == each2 && !commonList.contains(each1)) {
                    commonList.add(each1);
                }
            }
        }
        System.out.println(commonList);
    }
}
