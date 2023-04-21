package day31_ArrayList_ForEachLoop;

public class C03_SumOfSquare {
    public static void main(String[] args) {
        int[]arr={3,5,2,3,1};


        sumOfSquare(arr);
    }

    public static void sumOfSquare(int[] arr){

        int sum=0;

        for (int w:arr) {
            sum+=w*w;
        }
        System.out.println("sumOfTheSquare: "+sum);
    }
}
