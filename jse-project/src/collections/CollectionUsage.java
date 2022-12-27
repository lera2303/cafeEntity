package collections;

import java.io. *;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionUsage {
        static File file = new File("src/employee-input.txt");
        //Files class

        //static FileWriter writer;
        static Scanner scanner;
        static ArrayList<String> listOfEmployees = new ArrayList<>();
    static {
        try {
            //writer = new FileWriter(file);
            scanner = new Scanner(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void alphabeticOrder(ArrayList<String> listOfNames){
        Collections.sort(listOfNames);
        
    }

    public static void main(String[] args) throws IOException {
        while(scanner.hasNext()){
            listOfEmployees.add(scanner.nextLine());
        }
        scanner.close();
        alphabeticOrder(listOfEmployees);
        for(int i = 0; i < listOfEmployees.size(); i++){
            System.out.println(listOfEmployees.get(i) + "\n");
        }

    }
}
