package pattern.number;

public class Pattern1234 {
    public static void main(String[] args) {
        int numberOfRows = 4;
        int numberOfCols = 4;

        for(int i = 1; i <= numberOfRows; i++) {
            for(int j = 1; j <= numberOfCols; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
