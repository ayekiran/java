public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153; 
        int originalNumber = number;
        int sum = 0;
        int digits = 0;

        while (number != 0) {
            number /= 10;
            digits++;
        }

        number = originalNumber;
        for(; number != 0; number/=10) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
        }

        if(sum == originalNumber) 
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
