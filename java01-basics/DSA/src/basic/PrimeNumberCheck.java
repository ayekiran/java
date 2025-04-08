public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number = 97;
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count += 1;
            }
        }

        if(count == 2)
            System.out.println("Prime"); 
        else
            System.out.println("Composite");
    }
}
