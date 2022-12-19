package collections;

import java.io. *;
import java.util.ArrayList;
import java.util.Scanner;

public class CollectionUsage {
        static File file = new File("src/employee-input.txt");
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
        
    }

    public static void main(String[] args) throws IOException {
        while(scanner.hasNext()){
            listOfEmployees.add(scanner.nextLine());
        }
        scanner.close();


    }
}
