import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        String repeat = "No";
        do {
            System.out.println("Number a=");
            double a = scanner.nextDouble();
            System.out.println("Number b =");
            double b = scanner.nextDouble();
            sum = a + b;

            System.out.println("The sum of the numbers is:" + sum);
            System.out.println("Do you want to repeat?");

            repeat = scanner.next();
        }while (repeat.equalsIgnoreCase("Yes"));
        System.out.println("Bye,bye!");
    }

    }

