package pattern.letter;

public class LowerPyramid {
    public static void main(String[] args) {
        int numberOfRows = 4;

        for(int i = numberOfRows; i >= 1; i--) {
            for (int spaces = 0; spaces < numberOfRows - i; spaces++) {
                System.out.print(" ");
            }

            for(char ch = 'a'; ch < 'a' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
