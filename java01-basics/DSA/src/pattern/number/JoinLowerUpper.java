package pattern.number;

public class JoinLowerUpper {
    public static void main(String[] args) {
        int numberOfRows = 4;

        for(int i = 1; i <= numberOfRows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i = 2; i <= numberOfRows; i++) {
            for(int j = i; j <= numberOfRows; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
