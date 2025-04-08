package pattern.number;

public class StarPyramid {
    public static void main(String[] args) {
        int numberOfRows = 4;

        for(int i = 1; i <= numberOfRows; i++) {
            for(int spaces = 1; spaces <= numberOfRows - i; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
        
        for(int i = numberOfRows-1; i >= 1; i--) {
            for(int spaces = 1; spaces <= numberOfRows - i; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
    
}
