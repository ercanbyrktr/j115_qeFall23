package day29_ArrayList2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_equals {
    public static void main(String[] args) {
        List<Integer> numbers1=new ArrayList<>();
        //Equals() method checks the index by index if the values are same

        //Collections grandparent class

        numbers1.add(3);
        numbers1.add(8);
        numbers1.add(1);
        numbers1.add(2);

        List<Integer>numbers2=new ArrayList<>();

        numbers2.add(3);
        numbers2.add(8);
        numbers2.add(1);
        numbers2.add(2);

        System.out.println(numbers2);//[3,8,1,2]

        System.out.println(numbers1.equals(numbers2));//true

        numbers2.set(1,1);
        numbers2.set(2,8);
        System.out.println(numbers2);

        System.out.println(numbers1.equals(numbers2));//false

        //checking if both list consist of same elements
        Collections.sort(numbers2);
        Collections.sort(numbers1);//[1,2,3,8]

        System.out.println(numbers1.equals(numbers2));//true
    }
}
