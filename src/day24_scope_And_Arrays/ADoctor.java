package day24_scope_And_Arrays;

public class ADoctor {
    //Class level instance variables for doctor
    public ADoctor(){
        System.out.println("Default constructor is used");
    }

    public void methodName(){

    }

    String name;
    String lastName;
    int bDay;
    boolean onVocation;
    String phoneNumber;

    //Static class level variables
    static String nameOfHospital = "Star Hospital";
    static String hospitalPhoneNumber = "3456789898";



}
