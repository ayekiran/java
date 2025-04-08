package pattern.number;

public class Pattern1234Continue {
    public static void main(String[] args) {
        int numberOfRows = 4;
        int numberOfCols = 4;
        int number = 1;

        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= numberOfCols; j++) {
                System.out.printf("%3d ", number);
                number++;
            }
            System.out.println();
        }
    }
}
