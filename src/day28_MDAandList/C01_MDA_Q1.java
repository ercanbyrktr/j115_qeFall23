package day28_MDAandList;

public class C01_MDA_Q1 {
    public static void main(String[] args) {
        //find how many even numbers are there in the array?
        int[][] arr = {{3, 5, 7}, {1, 2, 3, 4}, {1, 2}, {7}};
        int count=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]%2==0){
                    System.out.println(arr[i][j]);
                  count++;

                }
            }
        }
        System.out.print("number of even numbers in the arrays : "+count);
    }
}
