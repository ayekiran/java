package pattern.special;

public class UpperTriangularPattern {
    
    public static void main(String[] args) {
        int numberOfRows = 4;
        
        for (int i = numberOfRows; i >= numberOfRows; i--) {
            for (int spaces = 1; spaces <= numberOfRows - i; spaces++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
