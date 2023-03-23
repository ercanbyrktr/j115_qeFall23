package day10;

public class C09_NestedTernary {
    public static void main(String[] args) {

        int number=100;
        System.out.println(number>0 ?
                number%2==0 ? "Even number" : "Odd number" :
                number>-1000 && number<-99 ? "3 digits" : "not 3 digits");

    }
}
