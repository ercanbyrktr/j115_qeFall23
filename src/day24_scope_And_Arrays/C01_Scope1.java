package day24_scope_And_Arrays;

public class C01_Scope1 {

    //Class level variables can be reached anywhere in the class

    static int classLevelInt=100;


    public static void main(String[] args) {
        //if you create a variable inside a method, you can not reach it from outside of the method
        String str="John Doe";//scope of this method is main method

        System.out.println(str+classLevelInt);


        System.out.println();



        for (int i = 0; i <10 ; i++) {

            int num1=i+1;

            System.out.print(str+" "+num1+classLevelInt);
        }
        System.out.println();
        method1();

    }

    public static void method1(){

        int num2=1990;

        System.out.println("Method1"+num2+classLevelInt);

    }


}
