package operators;

import java.util.Scanner;

public class Calculator {
    //variabiles
    private static int numberOne;
    private static int numberTwo;
    private static String operand;
    static Scanner scanner = new Scanner(System.in);

    //method to show numbers
    private static void readNumbers(){
        System.out.println("Enter the first number: ");
        numberOne = scanner.nextInt();
        System.out.println("Enter the second number: ");
        numberTwo = scanner.nextInt();
        System.out.println("Your numbers are: "+numberOne + " and " +numberTwo);
    }

    private static String readOperand(){
        System.out.println("Enter operand: ");
        System.out.println("List of available operands: '+', '-', '*', '/', 'power'");
        operand = scanner.next();
        if(operand.equals("+") || operand.equals("-") || operand.equals("*") || operand.equals("/") || operand.equals("power")){
            return operand;
        } else {
            System.out.println("ERROR: operand undefined! ");
            readOperand();
        }
        return null;
    }

    //calculator
    private static void calculator(int numberone, int numbertwo, String operand){
        switch (operand){
            case "+" :
                System.out.println("Operand: +");
                int sum = numberone + numbertwo;
                System.out.println(numberone + " " + operand + " " + numbertwo + " = " + sum);
                break;
            case "-" :
                System.out.println("Operand: -");
                int minus = numberone - numbertwo;
                System.out.println(numberone + " " + operand + " " + numbertwo + " = " + minus);
                break;
            case "*":
                System.out.println("Operand: *");
                int multiply = numberone * numbertwo;
                System.out.println(numberone + " "+ operand +" " + numbertwo + " = " + multiply);
                break;
            case "/":
                System.out.println("Operand: /");
                System.out.println("CAUTION: Int will parse in double");
                double fraction = (double) numberone/numbertwo;
                System.out.println(numberone + " " + operand + " " + numbertwo + " = " + fraction);
                break;
            case "power":
                System.out.println("Operand: power!");
                double pow = Math.pow(numberone,numbertwo);
                System.out.println(numberone + " " + operand + " " + numbertwo + " = " + pow);
        }


    }
    public static void main(String[] args){
        readNumbers();
        String operandTemp = readOperand();
        calculator(numberOne, numberTwo, operandTemp);



    }


}
