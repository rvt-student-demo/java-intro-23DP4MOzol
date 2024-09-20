package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        // Scanner scanner = new Scanner(System.in);

        // String valueAsString = "42.42";
        // double value = Double.valueOf(valueAsString);
        // System.out.println(value);


        // Scanner Scanner = new Scanner(System.in);
        // System.out.println("Write a boolean ");
        // boolean value = Boolean.valueOf(scanner.nextLine());
        // System.out.println("You wrote " + value);



        // Scanner scanner = new Scanner(System.in);
        // String text = scanner.nextLine();
        // int integer = Integer.valueOf(scanner.nextLine());
        // double floatingPoint = Double.valueOf(scanner.nextLine());
        // boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println(first + " + " + second + " = " + (first + second));

        System.out.println(first + " - " + second + " = " + (first - second));

        System.out.println(first + " * " + second + " = " + (first * second));
        
        double result = first / (double) second;  
        System.out.println(first + " / " + second + " = " + result);

    }
}
