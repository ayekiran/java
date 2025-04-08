import java.util.Scanner;

public class BasicOperation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Select Operation: \n" + 
                   "1. Addition\n" + 
                   "2. Subtraction\n" + 
                   "3. Multiplication\n" +
                   "4. Division\n" +
                   "Enter your choice (1, 2, 3, or 4): ");

        int choice = scan.nextInt();

        System.out.print("\nEnter the first number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scan.nextInt();

        if(choice == 1){
            System.out.println("Result: " + (firstNumber + secondNumber));
        } else if(choice == 2) {
            System.out.println("Result: " + (firstNumber - secondNumber));
        } else if(choice == 3) {
            System.out.println("Result: " + (firstNumber * secondNumber));
        } else if(choice == 4) {
            if (secondNumber != 0) {
                System.out.println("Result: " + (firstNumber / secondNumber));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
        }

        scan.close();
    }
}
