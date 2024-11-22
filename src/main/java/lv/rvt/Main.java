package lv.rvt;

// import java.util.ArrayList;
// import java.util.Scanner;

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


// public class App 
// {
//     public static void main ( String[] args )
//     {
//       int[] valA = { 13, -22, 82, 17}; 
//       int[] valB = { 0, 0, 0, 0 };
      
//       valB[0] = 25 - valA[0];
//       valB[1] = 25 - valA[1];
//       valB[2] = 25 - valA[2];
//       valB[3] = 25 - valA[3];
  
//       System.out.println("valA: " 
//           + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3]);
   
//       System.out.println("valB: " 
//           + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3]);
  
//       System.out.println("sum:  " 
//           + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " 
//           + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]));
//     }
//   } 


    // public static void main ( String[] args )
    // {
    //   int[] val = {0, 1, 2, 3}; 
    //   int temp;
  
    //   System.out.println("Original Array: " 
    //       + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
  
    //   temp = val[0];
    //   val[0] = val[3];
    //   val[3] = temp;
  
    //   temp = val[1];
    //   val[1] = val[2];
    //   val[2] = temp;
  
    //   System.out.println("Reversed Array: " 
    //       + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
    // }
  

    // public class App 
    // {

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     ArrayList<String> names = new ArrayList<>();
    //     ArrayList<Integer> birthYears = new ArrayList<>();


    //     while (true) {
    //         System.out.println("Enter name and birth year (name,year), or press Enter to finish:");
    //         String input = scanner.nextLine();
    //         if (input.isEmpty()) {
    //             break; 
    //         }


    //         String[] parts = input.split(",");
    //         String name = parts[0];
    //         int birthYear = Integer.parseInt(parts[1]);


    //         names.add(name);
    //         birthYears.add(birthYear);
    //     }


    //     String longestName = "";
    //     for (String name : names) {
    //         if (name.length() > longestName.length()) {
    //             longestName = name;
    //         }
    //     }

    //     int sum = 0;
    //     for (int year : birthYears) {
    //         sum += year;
    //     }
    //     double averageBirthYear = sum / (double) birthYears.size();

    //     System.out.println("Longest name: " + longestName);
    //     System.out.println("Average of the birth years: " + averageBirthYear);
    //     scanner.close();
    // }
//     public class App 
//     {
//         public static void main(String[] args) {
//     Account artosAccount = new Account("Arto's account", 100.00);
//     Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

//     System.out.println("Initial state");
//     System.out.println(artosAccount);
//     System.out.println(artosSwissAccount);

//     artosAccount.withdraw(20);
//     System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
//     artosSwissAccount.deposit(200);
//     System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());

//     System.out.println("End state");
//     System.out.println(artosAccount);
//     System.out.println(artosSwissAccount);
// } 
// }
// public class App {
//     private String name;
//     private double price;
//     private int quantity;

//     public void printProduct() {
//         System.out.println(name + ", price " + price + ", " + quantity + " pcs");
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // User inputs for product details
//         System.out.print("Enter product name: ");
//         String name = scanner.nextLine();

//         System.out.print("Enter product price: ");
//         double price = scanner.nextDouble();

//         System.out.print("Enter product quantity: ");
//         int quantity = scanner.nextInt();

//         // Create a Product instance with user input
//         Product userProduct = new Product(name, price, quantity);

//         // Print product information
//         userProduct.printProduct();

//         scanner.close();
//     }
// public class App {

    

//     public static void main(String[] args) {
//         DecreasingCounter counter = new DecreasingCounter(10);

//         counter.printValue();
//         counter.decrement();
//         counter.printValue();
//         counter.decrement();
//         counter.printValue();

//         counter = new DecreasingCounter(2);
//         counter.printValue();
//         counter.decrement();
//         counter.printValue();
//         counter.decrement();
//         counter.printValue();
//         counter.decrement();
//         counter.printValue();

//         counter = new DecreasingCounter(100);
//         counter.printValue();
//         counter.reset();
//         counter.printValue();
//         counter.decrement();
//         counter.printValue();
//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         Statistics allNumbers = new Statistics();
//         Statistics evenNumbers = new Statistics();
//         Statistics oddNumbers = new Statistics();

//         System.out.println("Enter numbers(Enter -1 to stop) : ");
//         while (true) {
//             String input = scanner.nextLine();

//             if (input.trim().isEmpty()) {
//                 continue;
//             }
//             try {
//                 int number = Integer.parseInt(input); // Convert input to integer
//                 if (number == -1) {
//                     break; // Exit loop if input is -1
//                 }

//                 // Add the number to the appropriate Statistics objects
//                 allNumbers.addNumber(number);
//                 if (number % 2 == 0) {
//                     evenNumbers.addNumber(number); // Even numbers
//                 } else {
//                     oddNumbers.addNumber(number); // Odd numbers
//                 }
//             } catch (NumberFormatException e) {
//                 System.out.println("Invalid input. Please enter an integer.");
//             }
//         }

//         // Print results
//         System.out.println("Sum: " + allNumbers.sum());
//         System.out.println("Sum of even numbers: " + evenNumbers.sum());
//         System.out.println("Sum of odd numbers: " + oddNumbers.sum());
//         System.out.println("Count: " + allNumbers.getCount());
//         System.out.println("Average: " + allNumbers.average());
//         scanner.close();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Part 1: Single card test
//         System.out.println("== Single Card Test ==");
//         PaymentCard card = new PaymentCard(50);
//         System.out.println(card);

//         card.eatAffordably();
//         System.out.println(card);

//         card.eatHeartily();
//         card.eatAffordably();
//         System.out.println(card);

//         // Part 2: Non-negative balance test
//         System.out.println("\n== Non-negative Balance Test ==");
//         PaymentCard card2 = new PaymentCard(5);
//         System.out.println(card2);

//         card2.eatHeartily();
//         System.out.println(card2);

//         card2.eatHeartily();
//         System.out.println(card2);

//         // Part 3: Adding money with limit test
//         System.out.println("\n== Adding Money with Limit Test ==");
//         PaymentCard card3 = new PaymentCard(10);
//         System.out.println(card3);

//         card3.addMoney(15);
//         System.out.println(card3);

//         card3.addMoney(10);
//         System.out.println(card3);

//         card3.addMoney(200);
//         System.out.println(card3);

//         // Part 4: Adding negative money test
//         System.out.println("\n== Adding Negative Money Test ==");
//         PaymentCard card4 = new PaymentCard(10);
//         System.out.println("Paul: " + card4);

//         card4.addMoney(-15);
//         System.out.println("Paul: " + card4);

//         // Part 5: Multiple cards test
//         System.out.println("\n== Multiple Cards Test ==");
//         PaymentCard paulsCard = new PaymentCard(20);
//         PaymentCard mattsCard = new PaymentCard(30);

//         // Paul eats heartily
//         paulsCard.eatHeartily();

//         // Matt eats affordably
//         mattsCard.eatAffordably();

//         // Print balances
//         System.out.println("Paul: " + paulsCard);
//         System.out.println("Matt: " + mattsCard);

//         // Paul tops up 20 euros
//         paulsCard.addMoney(20);

//         // Matt eats heartily
//         mattsCard.eatHeartily();

//         // Print balances
//         System.out.println("Paul: " + paulsCard);
//         System.out.println("Matt: " + mattsCard);

//         // Paul eats affordably twice
//         paulsCard.eatAffordably();
//         paulsCard.eatAffordably();

//         // Matt tops up 50 euros
//         mattsCard.addMoney(50);

//         // Print balances
//         System.out.println("Paul: " + paulsCard);
//         System.out.println("Matt: " + mattsCard);
//     }
// }

// import java.util.ArrayList;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Predefined list of books
//         ArrayList<Book> books = new ArrayList<>();
//         books.add(new Book("To Kill a Mockingbird", 281, 1960));
//         books.add(new Book("A Brief History of Time", 256, 1988));
//         books.add(new Book("Beautiful Code", 593, 2007));
//         books.add(new Book("The Name of the Wind", 662, 2007));

//         System.out.println("Choose a book by entering the number:");
//         for (int i = 0; i < books.size(); i++) {
//             System.out.println((i + 1) + ": " + books.get(i).getTitle());
//         }

//         ArrayList<Book> selectedBooks = new ArrayList<>();

//         // User selects books
//         while (true) {
//             System.out.print("Enter book number (or press Enter to finish): ");
//             String input = scanner.nextLine();

//             if (input.isEmpty()) {
//                 break;
//             }

//             try {
//                 int bookNumber = Integer.parseInt(input);

//                 if (bookNumber < 1 || bookNumber > books.size()) {
//                     System.out.println("Invalid choice. Please select a number between 1 and " + books.size());
//                 } else {
//                     Book selectedBook = books.get(bookNumber - 1);
//                     selectedBooks.add(selectedBook);
//                     System.out.println(selectedBook.getTitle() + " added to your list.");
//                 }
//             } catch (NumberFormatException e) {
//                 System.out.println("Please enter a valid number.");
//             }
//         }

//         // Ask what to print
//         System.out.print("\nWhat information will be printed? (everything / name): ");
//         String choice = scanner.nextLine();

//         if (choice.equals("everything")) {
//             for (Book book : selectedBooks) {
//                 System.out.println(book.getDetails());
//             }
//         } else if (choice.equals("name")) {
//             for (Book book : selectedBooks) {
//                 System.out.println(book.getTitle());
//             }
//         } else {
//             System.out.println("Invalid choice.");
//         }

//         scanner.close();
//     }
// }

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10); // Pause for 10 milliseconds (simulate hundredths of a second)
            } catch (Exception e) {
                System.out.println("Error in timer: " + e.getMessage());
            }
        }
    }
}
