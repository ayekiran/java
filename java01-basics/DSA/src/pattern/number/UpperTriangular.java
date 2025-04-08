package pattern.number;

public class UpperTriangular {
    public static void main(String[] args) {
        int numberOfRows = 4;

        for(int i = 1; i <= numberOfRows; i++) {
            for(int j = i; j <= numberOfRows; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
