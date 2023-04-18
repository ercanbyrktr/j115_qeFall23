package day29_ArrayList2;

import java.util.ArrayList;
import java.util.List;

public class C04_IndexOfAndLastIndexOf {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Esra");
        names.add("Mohammed");
        names.add("Bahadir");
        names.add("Kaan");
        names.add("Bahadir");
        names.add("Seda");

        System.out.println(names);//[Esra, Mohammed, Bahadir, Kaan, Bahadir, Seda]

        //ındexof() method returns the index of first occurence
        System.out.println(names.indexOf("Bahadir"));//2
        System.out.println(names.indexOf("Kaan"));//3


        System.out.println(names.indexOf("Seda"));//5

        //print element index 4
        System.out.println(names.get(4));//Bahadir

        //lastindexof() method the index of last occurence
        System.out.println(names.lastIndexOf("Bahadir"));//4

        //when indexOf() == lastIndexOf means element used once in the list
        //when indexOf() != lastIndexOf means element used more than once in the list

    }
}
