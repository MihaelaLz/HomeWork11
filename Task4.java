import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String stop = "Y";

        do {
            System.out.println("Please enter a number:");
            int a = scanner.nextInt();
            if (a > max) {
            max = a;
        }else if (a<min){
                min = a;
            }
            System.out.println("Do you want to continue?");
            stop = scanner.next();

        }while (!stop.equalsIgnoreCase("No"));
        System.out.println("Your max number is " + max);
        System.out.println("Your min number is " + min);
    }
}
