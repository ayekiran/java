import java.util.Scanner;

class FindTheDay {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your day:  ");
        int day = scan.nextInt();

        if(day > 0) {
            int reminder = day%6;

            switch (reminder) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid day");
            }
        } else {
            System.out.println("Invalid day number");
        }

        scan.close();
    }
}