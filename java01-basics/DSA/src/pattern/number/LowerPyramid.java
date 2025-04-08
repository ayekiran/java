package pattern.number;

public class LowerPyramid {
    public static void main(String[] args) {
        int numberOfRows = 4;
        
        for(int i = numberOfRows; i >= 1; i--) {
            for(int spaces = 1; spaces <= numberOfRows - i; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
