public class FactorialNumber {
    
    public static void main(String[] args) {

        int number = 5;
        int factorial = 1;

        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.printf("%d factorial is = %d", number, factorial);
    }
}
