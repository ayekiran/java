import java.util.Scanner;

public class Wish {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter yourname:  ");
        String userName = scan.next();

        System.out.printf("Hello, %s\n", userName);

        scan.close();
    }
}
