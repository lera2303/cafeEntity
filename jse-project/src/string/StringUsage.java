package string;




import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringUsage {
    static File file = new File("src/input.txt");
    static Scanner scanner;

    static {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //to uppercase
    private static String toUpperCase(String text){
        return text.toUpperCase();
    }

    //to lowercase
    private static String toLowerCase(String text){
        return text.toLowerCase();
    }

    // determine length
    private static int phraseLength(String phrase){
        return phrase.length();
    }

    //private methods consonants and vowels in the phrase
    private static void consonantsAndVowels(String phrase){
        int countConsonants = 0;
        int countVowels = 0;
        for(int i = 0; i < phrase.length(); i++){
            char currentLetter = phrase.charAt(i);
            if(currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'i' || currentLetter == 'o' || currentLetter == 'u'){
                countVowels ++;
            } else if('a' <= currentLetter && currentLetter <= 'z') {
                countConsonants++;
            }
        }
        System.out.println("The number of consonants is: "+countConsonants
                           +", and the number of vowels is: " + countVowels +"!");
    }

    //count number of words in a phrase
    private static void numberOfWords(String phrase){
        int countWords = 1;
        for(int i = 0; i < phrase.length(); i++){
            char currentPosition = phrase.charAt(i);
            if(currentPosition == ' '){
                countWords++;
            }
        }
        System.out.println("The number of words is: " + countWords);
    }

    //word having maximum length
    private static void wordMaxLength(String phrase){
        int maxLen = 0;
        String max = "";
        int currentLen = 0;
        String[] arrayOfWords;
        String delimeter = " ";
        arrayOfWords = phrase.split(delimeter);


        maxLen = arrayOfWords[0].length();
        max = arrayOfWords[0];
        for(int i = 0; i< arrayOfWords.length; i++){
            currentLen = arrayOfWords[i].length();
            if(maxLen < currentLen){
                maxLen = currentLen;
                max = arrayOfWords[i];
            }
        }
        System.out.println("The word "+ max + " has maximum length, with length of " + maxLen + "letters");


    }

    //word having minimum length
    private  static void wordMinLength(String phrase){
        int minLen = 0;
        String min = "";
        int currentLen = 0;
        String[] arrayOfWords;
        String delimeter = " ";
        arrayOfWords = phrase.split(delimeter);

        minLen = arrayOfWords[0].length();
        min = arrayOfWords[0];
        for(int i = 0; i< arrayOfWords.length; i++){
            currentLen = arrayOfWords[i].length();
            if(minLen > currentLen){
                minLen = currentLen;
                min = arrayOfWords[i];
            }
        }
        System.out.println("The word " + min + " has minimum length, with length: " + minLen + " letters!");
    }

    //dublicare words
    private static void duplicateWords(String phrase){

    }
    public static void main(String[] args) {
        //System.out.println(file.exists());
        String phrase;
        while (scanner.hasNext()){
            phrase = scanner.nextLine();
            System.out.println(phrase);
        }

    }
}
