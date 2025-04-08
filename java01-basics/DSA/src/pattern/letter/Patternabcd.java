package pattern.letter;

public class Patternabcd {
    public static void main(String[] args) {
        int numberOfRows = 4;
        int numberOfCols = 4;

        for (int i = 1; i <= numberOfRows; i++) {
            for (char ch = 'a'; ch < 'a' + numberOfCols; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
