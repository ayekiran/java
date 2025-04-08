public class PerfectNumber {
    public static void main(String[] args) {
        int number = 28;
        int sum = 0;
        int temp = number;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if(sum == temp)
            System.out.println("Perfect"); 
        else
            System.out.println("NOT Perfect");
    }
}
