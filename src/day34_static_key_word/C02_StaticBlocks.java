package day34_static_key_word;

public class C02_StaticBlocks {

    C02_StaticBlocks(){
        System.out.println("Constructor is executed");
    }

    public static void main(String[] args) {
        System.out.println("main class is executed");

        System.out.println("========================================");

        C02_StaticBlocks obj=new C02_StaticBlocks();
    }

    //static bloc is created below. static block is the first one to execute
    static {
        System.out.println("Static block is executed");
    }

    //non-static block is created below

    {
        System.out.println("Non-static block is executed");
    }
}
