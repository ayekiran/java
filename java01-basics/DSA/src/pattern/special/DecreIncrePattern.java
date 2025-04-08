package pattern.special;

public class DecreIncrePattern {
    public static void main(String[] args) {
        int numberOfRows = 4;

        /**DecrementPatter goes her */
        for(int i = 1; i <= numberOfRows; i++) {
            for(int j = i; j <= numberOfRows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        /**IncrementPatter goes her */
        for(int i = 1; i <= numberOfRows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
