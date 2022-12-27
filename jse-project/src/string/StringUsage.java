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
    private static void toUpperCase(String text){

        text = text.toUpperCase();
        try {
            fw.write(text);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //to lowercase
    private static void toLowerCase(String text) {

        text = text.toLowerCase();
        try {
            fw.write(text);
            fw.flush();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    // determine length
    private static void phraseLength(String phrase){
        int phraseLength = phrase.length();
        String statement = "The phrase's length is: " + phraseLength;
        try{
            fw.write(statement);
            fw.flush();
        } catch(IOException e){
            throw new RuntimeException(e);
        }
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
        String statement = "The number of consonants is " + countConsonants + " and the number of vowles is "+countVowels +"!";
        try{
            fw.write(statement);
            fw.flush();
        } catch(IOException e){
            throw new RuntimeException(e);
        }
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
        String statement = "The number of words is: " + countWords + "!";
        try{
            fw.write(statement);
            fw.flush();
        } catch(IOException e){
            throw new RuntimeException(e);
        }

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
        String statement = "The word "+max+" has maximum length, with length of "+maxLen + " letters";
        try{
            fw.write(statement);
            fw.flush();
        } catch(IOException e){
            throw new RuntimeException(e);
        }

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
        String statement = "The word "+min+" has minimum length, with length: "+minLen+" letterd!";
        try{
            fw.write(statement);
            fw.flush();
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    //dublicare words

    private static void duplicateWords(String phrase){
        //cuvintele care se intilnesc de mai multe ori
        String[] arrayOfWords;
        ArrayList<String> duplicateWords = new ArrayList<>();
        String delimiter = " ";
        arrayOfWords = phrase.split(delimiter);
        for(int i = 0; i < arrayOfWords.length; i++){
            for(int j = i+1; j < arrayOfWords.length; j++){
                if(arrayOfWords[i].equals(arrayOfWords[j])){
                    duplicateWords.add(arrayOfWords[i]);
                }
            }
        }



        for(int i = 0; i < duplicateWords.size(); i++){
            try{
                fw.write(duplicateWords.get(i) + " \n");
                fw.flush();
            } catch(IOException e){
                throw new RuntimeException(e);
            }
        }

    }
    public static void main(String[] args) throws IOException {
        //System.out.println(file.exists());
        String phrase ="";
        String result = "";
        while (scanner.hasNext()){
            phrase = scanner.nextLine();
            System.out.println(phrase);
        }
        //outupt in fiecare metoda
        //
        toUpperCase(phrase);
        toLowerCase(phrase);
        phraseLength(phrase);
        consonantsAndVowels(phrase);
        numberOfWords(phrase);
        wordMaxLength(phrase);
        wordMinLength(phrase);
        duplicateWords(phrase);
    }
}
