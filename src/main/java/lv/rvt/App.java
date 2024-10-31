package lv.rvt;

// import java.util.ArrayList;
// import java.util.Scanner;

// import java.util.*;

// public class App 
// {
//      public static void main( String[] args )
//     {

        // Scanner scanner = new Scanner(System.in);

        // int numbersRead = 0;
        // int sum = 0;

        // while (true) {
        //     if (numbersRead == 5) {
        //         break;
        //     }

        //     System.out.println("Input number");
        //     sum = sum + Integer.valueOf(scanner.nextLine());
        //     numbersRead = numbersRead + 1;
        // }

        // System.out.println("The sum of the numbers is " + sum);
        // scanner.close();

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


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Password? ");
        // String password = scanner.nextLine();
        // if (password.equals("Caput Draconis")) {
        //     System.out.println("Welcome!");
        // } else {
        //     System.out.println("Off with you!");
        // }
        // scanner.close();


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the first string: ");
        // String firstString = scanner.nextLine();
        // System.out.print("Enter the second string: ");
        // String secondString = scanner.nextLine();
        // if (firstString.equals(secondString)) {
        //     System.out.println("Same");
        // } else {
        //     System.out.println("Different");
        // }
        // scanner.close();


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("How old are you? ");
        // int age = scanner.nextInt();
        // if (age >= 0 && age <= 120) {
        //     System.out.println("OK");
        // } else {
        //     System.out.println("Impossible!");
        // }
        // scanner.close();


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Give a year: ");
        // int year = scanner.nextInt();
        // if (year % 4 != 0) {
        //     System.out.println("The year is not a leap year.");
        // } else if (year % 100 == 0 && year % 400 != 0) {
        //     System.out.println("The year is not a leap year.");
        // } else {
        //     System.out.println("The year is a leap year.");
        // }
        // scanner.close();



        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Value of the gift? ");
        // int giftValue = scanner.nextInt();
        // double tax = 0.0;
        // if (giftValue < 5000) {
        //     System.out.println("No tax!");
        // } else if (giftValue <= 25000) {
        //     tax = 100 + (giftValue - 5000) * 0.08;
        //     System.out.println("Tax: " + tax);
        // } else if (giftValue <= 55000) {
        //     tax = 1700 + (giftValue - 25000) * 0.10;
        //     System.out.println("Tax: " + tax);
        // } else if (giftValue <= 200000) {
        //     tax = 4700 + (giftValue - 55000) * 0.12;
        //     System.out.println("Tax: " + tax);
        // } else if (giftValue <= 1000000) {
        //     tax = 22100 + (giftValue - 200000) * 0.15;
        //     System.out.println("Tax: " + tax);
        // } else {
        //     tax = 142100 + (giftValue - 1000000) * 0.17;
        //     System.out.println("Tax: " + tax);
        // }
        // scanner.close(); 



        // Scanner scanner = new Scanner(System.in);
        // while (true) {
        //     System.out.print("Give a number: ");
        //     int number = scanner.nextInt();

        //     if (number < 0) {
        //         System.out.println("Unsuitable number");
        //     } else if (number == 0) {
        //         break;
        //     } else {
        //         System.out.println(number * number);
        //     }
        // }
        // scanner.close();


        // Scanner scanner = new Scanner(System.in);
        // int count = 0;  // To keep track of the number of inputs
        // int sum = 0;    // To keep track of the sum of inputs

        // while (true) {
        //     System.out.print("Give a number: ");
        //     int number = scanner.nextInt();

        //     if (number == 0) {
        //         break;  // Exit the loop when the user inputs 0
        //     }

        //     count++;    // Increment the count for each input
        //     sum += number;  // Add the number to the sum
        // }

        // System.out.println("Number of numbers: " + count);
        // System.out.println("Sum of the numbers: " + sum);

        // scanner.close();


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number less than 100: ");
        // int number = scanner.nextInt();  
        // for (int i = number; i <= 100; i++) {
        //     System.out.println(i);
        // }
        // scanner.close();


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Give a number: ");
        // int number = scanner.nextInt();
        // int factorial = 1;
        // for (int i = 1; i <= number; i++) {
        //     factorial *= i;  
        // }
        // System.out.println("Factorial: " + factorial);
        // scanner.close();


        // Scanner scanner = new Scanner(System.in);
        // int sum = 0;
        // int count = 0;
        // int evenCount = 0;  // To count the number of even numbers
        // int oddCount = 0;   // To count the number of odd numbers
        
        // System.out.println("Give numbers:");
        
        // while (true) {
        //     int number = scanner.nextInt();
            
        //     if (number == -1) {
        //         System.out.println("Thx! Bye!");
        //         break;
        //     }
            
        //     sum += number;
        //     count++;
            
        //     if (number % 2 == 0) {
        //         evenCount++;  // Increment the even counter
        //     } else {
        //         oddCount++;   // Increment the odd counter
        //     }
        // }
        
        // System.out.println("Sum: " + sum);
        // System.out.println("Numbers: " + count);
        
        // if (count > 0) {
        //     double average = (double) sum / count;
        //     System.out.println("Average: " + average);
        // }
        
        // System.out.println("Even: " + evenCount);
        // System.out.println("Odd: " + oddCount);
        
        // scanner.close();


    //     Scanner scanner = new Scanner(System.in);
        
    //     System.out.print("How many times? ");
    //     int times = scanner.nextInt();  
        
    //     int count = 0;
    //     while (count < times) {
    //         printText(); 
    //         count++; 
    //     }

    //     scanner.close();
    // }

    //     public static void printText() {
    //         System.out.println("In a hole in the ground there lived a method");


    //     divisibleByThreeInRange(3, 6);
    //     System.out.println();
    //     divisibleByThreeInRange(2, 10);
    // }

        
    // public static void divisibleByThreeInRange(int beginning, int end) {
    //     for (int i = beginning; i <= end; i++) {
    //         if (i % 3 == 0) {
    //             System.out.println(i); 
    //     }
    // }





        // public static void printStars(int number) {
        //     for (int i = 0; i < number; i++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    
        // public static void printSquare(int size) {
        //     for (int i = 0; i < size; i++) {
        //         printStars(size);
        //     }
        // }
    
        // public static void printRectangle(int width, int height) {
        //     for (int i = 0; i < height; i++) {
        //         printStars(width);
        //     }
        // }
    
        // public static void printTriangle(int size) {
        //     for (int i = 1; i <= size; i++) {
        //         printStars(i);
        //     }
        // }
    
        // public static void main(String[] args) {
        //     printStars(5);  
        //     printStars(3);  
        //     printStars(9);  
    
        //     System.out.println("Square:");
        //     printSquare(4); 
    
        //     System.out.println("Rectangle:");
        //     printRectangle(17, 3); 
    
        //     System.out.println("Triangle:");
        //     printTriangle(4); 
        // }


//         ArrayList<String> strings = new ArrayList<>();
//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.print("Enter a string (or press Enter to stop): ");
//             String input = scanner.nextLine();
//             if (input.isEmpty()) {
//                 break;
//             }
//             strings.add(input);
//         }
//         scanner.close();

//         for (String name : strings) {
//             System.out.println(name);
//         }

//         if (strings.size() >= 3) {
//             System.out.println("\n" + strings.get(2));
// } 


//  public class App 
//  {
//       public static void main( String[] args )
//     {
//     int[] val = {0, 1, 2, 3}; 
//     int sum = 0; 

//     for (int i = 0; i < val.length; i++) {
//       sum += val[i];
//     }

//     System.out.println( "Sum of all numbers = " + sum );
//   }
// }
// public class App 
// {
//     public static void main ( String[] args )
//     {
//         int[] val = {13, -4, 82, 17}; 
//         int[] twice = new int[val.length]; 

//         System.out.println("Original Array: " 
//             + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);


//         for (int i = 0; i < val.length; i++) {
//             twice[i] = val[i] * 2;
//         }

//         System.out.println("New Array: " 
//             + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);
//         }
// }

// public class App 
// {
//     public static void main ( String[] args )
//     {
//     int[] valA = { 13, -22, 82, 17}; 
//     int[] valB = {-12, 24, -79, -13};
//     int[] sum = { 0, 0, 0, 0 };
    
//     sum[0] = valA[0] + valB[0];
//     sum[1] = valA[1] + valB[1];
//     sum[2] = valA[2] + valB[2];
//     sum[3] = valA[3] + valB[3];

//     System.out.println("sum: " 
//         + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3]);
//     }
//     }


public class App 
{
    public static void main ( String[] args )
    {
      int[] valA = { 13, -22, 82, 17}; 
      int[] valB = { 0, 0, 0, 0 };
      
      valB[0] = 25 - valA[0];
      valB[1] = 25 - valA[1];
      valB[2] = 25 - valA[2];
      valB[3] = 25 - valA[3];
  
      System.out.println("valA: " 
          + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3]);
   
      System.out.println("valB: " 
          + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3]);
  
      System.out.println("sum:  " 
          + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " 
          + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]));
    }
  } 
    
