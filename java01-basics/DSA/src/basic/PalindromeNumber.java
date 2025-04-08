public class PalindromeNumber {
    public static void main(String[] args) {
        int originalNumber = 1;
        int reversedNumber = 0;
        int temp = originalNumber;

        for(; temp != 0; temp /= 10) {
            int digit = temp % 10; 
            reversedNumber = reversedNumber * 10 + digit;
        }

        if(reversedNumber == originalNumber)
            System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}
