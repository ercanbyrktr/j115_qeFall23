package day15;

public class C03_Question2 {
    //Question 2: Get a String from the user and the text to be searched.
//Check the usage of the desired text in the String and print the appropriate one of the following sentences.

    //String does not contain the searched text
//Searched text used only once in the String
//Searched text used more than 1 in the String
    public static void main(String[] args) {

        String sentence="java is beautiful, java is easy";
        String word= "java";
        int wordUsageNumber=0;

        if (sentence.indexOf(word)==(-1)){
            System.out.println("String does not contain the searched text");
        }else {
            int wordFirstIndex= sentence.indexOf(word);
            if (sentence.indexOf(word,(wordFirstIndex+1))==(-1)){
                System.out.println("Searched text used only once in the Strings");
            }else {
                int secondWordIndex=sentence.indexOf(word,(wordFirstIndex+1));
                if (sentence.indexOf(word,(secondWordIndex))==(-1)){
                    System.out.println("Searched text used more than 1 in the String");
                }else {
                    System.out.println("Searched text used more than 2 in the Strings");
                }
            }
        }

    }
}
