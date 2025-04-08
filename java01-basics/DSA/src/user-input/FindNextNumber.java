import java.util.Scanner;

public class FindNextNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Select the sequence type: \n" + 
                   "1. Arithmetic Progression\n" + 
                   "2. Geometric Progression\n" + 
                   "Enter your choice (1 or 2): ");

        int choice = scan.nextInt();

        System.out.print("\nEnter the first term: ");
        int firstTerm = scan.nextInt();

        System.out.print("Enter the find term: ");
        int term = scan.nextInt();

        if (choice == 1) {
            System.out.print("Enter the common difference: ");
            int commonDiff = scan.nextInt();

            System.out.print(firstTerm + " ");
            for(int i = 1; term > i; i++) {
                int result = firstTerm + (i) * commonDiff;
                System.out.print(result + " ");
            }
        } else if (choice == 2) {
            System.out.print("Enter the common multiplier: ");
            int commonMul = scan.nextInt();
            
            System.out.print(firstTerm + " ");
            for(int i = 1; term > i; i++) {
                int result = (int) (firstTerm * Math.pow(commonMul, i));
                System.out.print(result + " ");
            }
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scan.close();
    }
}
