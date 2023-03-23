package day10;

public class C07_Ternary {
    public static void main(String[] args) {
        //Question 3- Ask the user for a letter,
        // if the entered character is lowercase,
        // print it in uppercase, otherwise print the entered letter

        char letter='e';
        System.out.println(letter>='a' && letter<='z'
                ? Character.toUpperCase(letter)
                : letter);
    }
}
