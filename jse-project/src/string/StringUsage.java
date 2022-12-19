package string;




import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringUsage {
    static File fileInput= new File("src/input.txt");
    static File fileOutput= new File("src/output.txt");

    static FileWriter fw;

    static {
        try {
            fw = new FileWriter(fileOutput);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static Scanner scanner;

    static {
        try {
            scanner = new Scanner(fileInput);
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
    private static String consonantsAndVowels(String phrase){
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
        String statement = "The number of consonants is " + countConsonants + " and the number of vowles is "+countVowels +"!";
        return statement;
    }

    //count number of words in a phrase
    private static String numberOfWords(String phrase){
        int countWords = 1;
        for(int i = 0; i < phrase.length(); i++){
            char currentPosition = phrase.charAt(i);
            if(currentPosition == ' '){
                countWords++;
            }
        }
        String statement = "The number of words is: " + countWords + "!";

        return statement;
    }

    //word having maximum length
    private static String wordMaxLength(String phrase){
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
        String statement = "The word "+max+" has maximum length, with length of "+maxLen + " letters";
        return  statement;

    }

    //word having minimum length
    private  static String wordMinLength(String phrase){
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
        String statement = "The word "+min+" has minimum length, with length: "+minLen+" letterd!";
        return statement;
    }

    //dublicare words
    private static String duplicateWords(String phrase){
            return null;
    }
    public static void main(String[] args) throws IOException {
        //System.out.println(file.exists());
        String phrase ="";
        String result = "";
        while (scanner.hasNext()){
            phrase = scanner.nextLine();
            System.out.println(phrase);
        }
        fw.write(consonantsAndVowels(phrase));
        fw.flush();
    }
}
