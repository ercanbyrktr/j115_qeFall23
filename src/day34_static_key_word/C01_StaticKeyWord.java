package day34_static_key_word;

public class C01_StaticKeyWord {

    public static void main(String[] args) {

        //Calling **Static** variables and methods
        Nurse.staticMethod();//staticMethod() is used
        System.out.println(Nurse.hospitalName);//Star medical
        System.out.println(Nurse.hospitalPhone);//8888888


        //Calling **Static** variables and methods
        Nurse nurse1=new Nurse();
        System.out.println(nurse1.nurseName);//Blank nurse name
        System.out.println(nurse1.age);//0


        Nurse nurse2=new Nurse();
        System.out.println(nurse2.nurseName);//Blank nurse name
        System.out.println(nurse2.age);//0

        //Updated nurse1 object non-static variables
        nurse1.nurseName="Emily Watson";
        nurse1.age=30;
        System.out.println(nurse1.nurseName);//Blank nurse name
        System.out.println(nurse1.age);//0

        System.out.println(nurse2.nurseName);//Blank nurse name
        System.out.println(nurse2.age);//0

        //update non-static variable
        Nurse.hospitalName="Moon medical";
        System.out.println(nurse1.hospitalName);//Moon medical
        System.out.println(nurse2.hospitalName);//Moon medical


        //update non-static variable from object
        nurse1.hospitalName="Sun medical";
        System.out.println(nurse1.hospitalName);//Sun medical

        System.out.println(nurse2.hospitalName);//Sun medical

        //call non-static method

        nurse1.nonStaticMethod();//nonStaticMethod() is used

        //call static method from object
        nurse1.staticMethod();//staticMethod() is used



    }
}
