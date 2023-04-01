package day20;

public class C03_NestedForLoops {
    public static void main(String[] args) {
        int line = 4;
        int column = 8;
        for (int j = 1; j <= line; j++) {// satir sayisini
            for (int i = 1; i <= column; i++) { // sutun sayisini
                System.out.print("* ");
            }
            System.out.println("");// bir satirdaki tum sutunlar bitince alt satira geciyor
        }
    }
}
