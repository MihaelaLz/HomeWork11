import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of rows and columns you want to print:");
        size= scanner.nextInt();
        System.out.println("***Printing the pattern***");
        for (int row = 1; row <=size; row++){

            for(int column =1; column<=size;column++){
                System.out.print("  #  ");
            }
            System.out.println();

        }

    }
}
