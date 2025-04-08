package pattern.special;

public class ReverseDecrementPattern {
    public static void main(String[] args) {
        int numberOfRows = 4;

        for(int i = 1; i <= numberOfRows; i++) {
            for (int spaces = 0; spaces < i; spaces++) {
                System.out.print(" ");
            }

            for (int j = numberOfRows; i <= j; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
