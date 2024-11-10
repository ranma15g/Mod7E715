/*

Class: COP 2800: Java Programming
Instructor: Francis Fiskey

7.15 (Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values in the array using the following method header:

public static int[] eliminateDuplicates(int[] list)

Write a test program that reads in ten integers, invokes the method, and displays the result. Here is the sample run of the program:

Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The distinct numbers are: 1 2 3 6 4 5

Due: Nov 10 by 11:59pm
I pledge by honor that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Sign here:   
 ___Eric Snyder___

*/

import java.util.Scanner; // Import the Scanner class

public class Main { // Open the class block

    /* Write a method that returns a new array by eliminating the 
       duplicate values in the array using the following method header:

       public static int[] eliminateDuplicates(int[] list) */

                                      // The list argument will contain the
    public static int[] eliminateDuplicates(int[] list) { // user input array

        // Create a new array to store unique numbers
        int[] distinctList = new int[list.length];

        // Initialize a counter to track the number of unique elements
        int count = 0;

        // Iterate through the input array
        for (int i = 0; i < list.length; i++) {

            // Declare a boolean variable to test if the current element is unique
            boolean isDuplicate = false;

            // Cycle through the distinctList to compare the current element against 
            for (int j = 0; j < count; j++) {// an element in the distinctList

              if (list[i] == distinctList[j]) {// If a duplicate is found

                    // set the isDuplicate flag to true
                    isDuplicate = true;
                    /* By setting the isDuplicate flag to true we know we have no
                       further use for the current element in the distinctList */
                    
                    break; /* Exit the iteration that compares the current 
                              element against the distinctList */

                }
            }

           
            if (!isDuplicate) {  // If the number is not a duplicate

                distinctList[count] = list[i]; // add it to the distinctList
                
                count++; /* Increment the count of unique elements for 
                            the next input array iteration */
            }
        }

        // Create a new array with the correct size to store the unique numbers
        int[] result = new int[count];

        // Copy the unique numbers from distinctList to result
        for (int i = 0; i < count; i++) {
            result[i] = distinctList[i];
        }

        // Return the array containing unique numbers
        return result;

    } // close the eliminateDuplicates method block



  
    public static void main(String[] args) { // Open the main method block

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Create an array to store 10 numbers
        int[] numbers = new int[10];

        // Prompt the user to enter 10 numbers
        System.out.print("Enter ten numbers:\n\n");

        for (int i = 0; i < numbers.length; i++) {
            
            System.out.print("Number " + (i + 1) + ": ");
          
                    // Read 10 numbers from the user using the nextInt() method
            numbers[i] = input.nextInt(); // and store them in the array

        }

        // Call the eliminateDuplicates method to get the distinct numbers
        int[] distinctNumbers = eliminateDuplicates(numbers);

        // Print the distinct numbers to the console
        System.out.print("The distinct numbers are: ");

        // By cycling through the distinctNumbers array
        for (int i = 0; i < distinctNumbers.length; i++) 
              System.out.print(distinctNumbers[i] + " ");

    } // close the main method block
  
} // close the class block