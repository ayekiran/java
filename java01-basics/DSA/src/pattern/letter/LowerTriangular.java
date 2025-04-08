package pattern.letter;

public class LowerTriangular {
    public static void main(String[] args) {
        int numberOfRows = 4;

        for(int i = numberOfRows; i >= 1; i--) {
            for(char ch = 'a'; ch < 'a' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
