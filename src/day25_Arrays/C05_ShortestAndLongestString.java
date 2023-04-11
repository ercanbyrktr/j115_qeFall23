package day25_Arrays;
//Question 6- Create a method that prints the longest and shortest words in a given String array.
public class C05_ShortestAndLongestString {
    public static void main(String[] args) {
        String[] nameArr= {"John", "Ibrahimovic", "messi", "Kaka", "Alex","Hagi","Ali"};

        ShortestAndLongest(nameArr);
    }

    public static void ShortestAndLongest (String[] strArray) {

        String longestName= strArray[0];
        String shorthestName= strArray[0];

        for (int i = 0; i <= strArray.length-1 ; i++) {

            if (strArray[i].length()>longestName.length()){
                longestName=strArray[i];
            }

            if (strArray[i].length()<shorthestName.length()){
                shorthestName=strArray[i];

            }

        }
        System.out.println("Arraydeki en uzun kelime:" +longestName);
        System.out.println("Arraydaki en kisa kelime:" +shorthestName);
    }
}
