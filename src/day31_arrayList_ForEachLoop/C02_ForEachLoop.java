package day31_arrayList_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        int[]arr={3,4,5,6,4,3,5,4,6,5,4,3,4,5,6,4,5,3,4,5,6,5,4};

        //1) for loop way
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");//3 4 5 6 4 3 5 4 6 5 4 3 4 5 6 4 5 3 4 5 6 5 4
        }
        System.out.println();//just to go to next line
        //2)for each loop

        for (int w:arr) {
            System.out.print(w+" ");//3 4 5 6 4 3 5 4 6 5 4 3 4 5 6 4 5 3 4 5 6 5 4
        }
        System.out.println();
        //find the sum of the elements for the array
        int sum=0;

        for (int w:arr) {
            sum+=w;
        }
        System.out.println("total : "+sum);


        //print elements can be divided by 3
        for (int w:arr) {
            if (w%3==0){
                System.out.print(w+ " ");
            }
        }
        //print all the odd numbers from the array
        int counter=0;
        for (int w:arr) {
            if (w%2!=0){
                System.out.print(w+" ");//3 5 3 5 5 3 5 5 3 5 5
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter+" ");//11

    }
}
