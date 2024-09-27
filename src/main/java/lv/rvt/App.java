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
        // scanner.close();


        // Scanner Scanner = new Scanner(System.in);
        // System.out.println("Write a boolean ");
        // boolean value = Boolean.valueOf(scanner.nextLine());
        // System.out.println("You wrote " + value);
        // scanner.close();



        // Scanner scanner = new Scanner(System.in);
        // String text = scanner.nextLine();
        // int integer = Integer.valueOf(scanner.nextLine());
        // double floatingPoint = Double.valueOf(scanner.nextLine());
        // boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());
        // scanner.close();


        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Give the first number:");
        // int first = Integer.valueOf(scanner.nextLine());
        // System.out.println("Give the second number:");
        // int second = Integer.valueOf(scanner.nextLine());

        // System.out.println(first + " + " + second + " = " + (first + second));

        // System.out.println(first + " - " + second + " = " + (first - second));

        // System.out.println(first + " * " + second + " = " + (first * second));
        
        // double result = first / (double) second;  
        // System.out.println(first + " / " + second + " = " + result);
        // scanner.close();


        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Give speed");
        // int number = Integer.valueOf(scanner.nextLine());
        // if (number > 120) {
        //      System.out.println("Speeding ticket!");
        // scanner.close();


        //  Scanner scanner = new Scanner(System.in);
        //  System.out.println("Give a number :");
        //  int number = Integer.valueOf(scanner.nextLine());
        //  if (number == 1984) {
        //       System.out.println("Orwell");
        // scanner.close();

            //   Scanner scanner = new Scanner(System.in);
        //   System.out.println("Give a year :");
        //   int number = Integer.valueOf(scanner.nextLine());
        //   if (number < 2015) {
        //        System.out.println("Ancient history!");
        // scanner.close();

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Give a number :");
        // int number = Integer.valueOf(scanner.nextLine());
        // if (number > 0) {
        //      System.out.println("The number is positive.");
        // } else {
        //     System.out.println("The number is not positive.");
        // }
        // scanner.close();


        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Give a number :");
        // int number = Integer.valueOf(scanner.nextLine());
        // if (number >= 18) {
        //      System.out.println("You are an adult");
        // } else {
        //     System.out.println("You are not an adult");
        // }
        // scanner.close();


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Give the first number: ");
        // int firstNumber = scanner.nextInt();
        // System.out.print("Give the second number: ");
        // int secondNumber = scanner.nextInt();
        // if (firstNumber > secondNumber) {
        //     System.out.println("Greater number is: " + firstNumber);
        // } else if (secondNumber > firstNumber) {
        //     System.out.println("Greater number is: " + secondNumber);
        // } else {
        //     System.out.println("The numbers are equal!");
        // }
        // scanner.close();
        

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Give points [0-100]: ");
        // int points = scanner.nextInt();
        // String grade;
        // if (points < 0) {
        //     grade = "impossible!";
        // } else if (points <= 49) {
        //     grade = "failed";
        // } else if (points <= 59) {
        //     grade = "1";
        // } else if (points <= 69) {
        //     grade = "2";
        // } else if (points <= 79) {
        //     grade = "3";
        // } else if (points <= 89) {
        //     grade = "4";
        // } else if (points <= 100) {
        //     grade = "5";
        // } else {
        //     grade = "incredible!";
        // }
        // System.out.println("Grade: " + grade);
        // scanner.close();


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Give a number: ");
        // int number = scanner.nextInt();
        // if (number % 2 == 0) {
        //     System.out.println("Number " + number + " is even.");
        // } else {
        //     System.out.println("Number " + number + " is odd.");
        // }
        // scanner.close();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Password? ");
        String password = scanner.nextLine();
        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
        scanner.close();



}

    }
