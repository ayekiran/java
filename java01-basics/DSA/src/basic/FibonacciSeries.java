public class FibonacciSeries {
    public static void main(String[] args) {
        
        int firstNumber = 0;
        int secondNumber = 1;
        int numberOfIterations = 10; // Total series have 10 items

        System.out.printf("%d  ", firstNumber);
        System.out.printf("%d  ", secondNumber);

        for(int i = 2; i < numberOfIterations; i++) {
            int nextNumber = firstNumber + secondNumber;

            firstNumber = secondNumber;
            secondNumber = nextNumber;

            System.out.printf("%d  ", nextNumber);
        }
    }
}
