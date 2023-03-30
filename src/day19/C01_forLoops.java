package day19;

public class C01_forLoops {
    public static void main(String[] args) {
        int number=5;
        int factorial=1;
        System.out.print(number+"! = ");
        for (int i =number; i >= 1; i--) {
            factorial *=i ;
            if (i!=1){
                System.out.print(i + " * ");
            }else{
                System.out.print(i + " ");
            }
        }
        System.out.println("= " + factorial);

    }
}


