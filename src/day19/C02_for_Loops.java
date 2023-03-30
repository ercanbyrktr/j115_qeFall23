package day19;

public class C02_for_Loops {
    public static void main(String[] args) {
        String input = "Java is good";
        String output="";

        for (int i = input.length()-1; i >=0 ; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);
    }
}
