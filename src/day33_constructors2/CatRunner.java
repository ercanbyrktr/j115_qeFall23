package day33_constructors2;

public class CatRunner {
    public static void main(String[] args) {

        Cat cat1=new Cat();

        System.out.println(cat1.name);//Kitkat
        System.out.println(cat1.age);//5

        cat1.name="lucy";
        cat1.age=2;
        System.out.println(cat1.name);//lucy
        System.out.println(cat1.age);//2

        Cat cat2=new Cat();
        System.out.println(cat2.name);
        System.out.println(cat2.age);

        Cat cat3=new Cat("pasha",3);
        System.out.println(cat3.name);
        System.out.println(cat3.age);

        Cat cat4=new Cat("cotton",12);
        System.out.println(cat4.name);
        System.out.println(cat4.age);

        System.out.println(cat4.name+" "+cat4.age);//cotton 12

        System.out.println(cat4.name.length());//6



        Cat cat5=new Cat("Grape");
        System.out.println(cat5.name);//Grape
        System.out.println(cat5.age);//0

        Cat cat6=new Cat(9);
        System.out.println(cat5.name);//null
        System.out.println(cat5.age);//9


    }
}
