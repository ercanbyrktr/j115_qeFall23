package day19;

public class C04_for_Loops {
    public static void main(String[] args) {
        //Question 2: Collect and print the String prices given by the user in a certain format.
        //input1: "15.31 $" , input2: "11.40 $"   total     //output : 26.71 $
        String str1="$15.31";
        String str2="$11.40";

        str1=str1.replaceAll("\\D","");
        double price1=Double.parseDouble(str1);
        str2=str2.replaceAll("\\D","");
        double price2=Double.parseDouble(str2);

        System.out.println("$"+(price1+price2)/100);

    }
}
