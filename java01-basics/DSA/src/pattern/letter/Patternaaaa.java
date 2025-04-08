package pattern.letter;

public class Patternaaaa {
    public static void main(String[] args) {
        int numberOfRows = 4;
        int numberOfCols = 4;
        char letter = 'a';

        for(int i = 1; i <= numberOfRows; i++) {
            for(int j = 1; j <= numberOfCols; j++) {
                System.out.print(letter + " ");
            }
            System.out.println();
            letter++;
        }
    }
}
