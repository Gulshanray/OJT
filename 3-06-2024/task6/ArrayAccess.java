
//6. Write a Java program that initializes an array of integers and prompts the user to enter an index to access. Use exception handling to catch any ArrayIndexOutOfBoundsException. 
import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50,45,78,95,64,78,98};         // Initialize an array of integers
        Scanner a = new Scanner(System.in);    // Create a Scanner object for user input
        try {
            System.out.print("Enter an index to access (0-10): ");           // Prompt the user to enter an index
            int index = a.nextInt();
            System.out.println("Value at index " + index + " is: " + numbers[index]);          // Access the array at the given index and print the value

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter a valid index (0-10).");             // Handle the exception if the index is out of bounds
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");        // Handle any other exceptions
        } 
    }
}
