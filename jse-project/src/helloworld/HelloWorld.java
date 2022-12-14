package helloworld;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        System.out.println("Hi! What's ur name?");
        name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }

}
