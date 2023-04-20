package day30_arrayList3;

import java.util.ArrayList;
import java.util.List;

public class C05_ChangingThePlacesOfListElements {
    public static void main(String[] args) {

        List<Integer> number=new ArrayList<>();
        number.add(3);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(33);

        System.out.println(number);

        int tempElementValue= number.get(1);//6 saved in temp box to not to lose it

        number.set(1, number.get(3));
        System.out.println(number);//[3, 6, 7, 8, 33]

        number.set(3,tempElementValue);//[3, 8, 7, 8, 33]

        System.out.println(number);//[3, 8, 7, 6, 33]


    }
}
