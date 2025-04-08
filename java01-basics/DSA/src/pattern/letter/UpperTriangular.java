package pattern.letter;

public class UpperTriangular {
    public static void main(String[] args) {
        int numberOfRows = 4;

        for(int i = 1; i <= numberOfRows; i++) {
            for(char ch = 'a'; ch < 'a' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
