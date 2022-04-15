import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int nul = 0;
        String stop = "stop";
        do {
            System.out.println("Please enter your numbers here:");
            int num = scanner.nextInt();
            if (num > 0) {
                positive++;

            } else if (num < 0) {
                negative++;

            } else {
                nul++;
            }
            System.out.println("Do you want to continue?");
            stop= scanner.next();
        }while (!stop.equalsIgnoreCase("stop"));
        System.out.println("You entered"+" "+ positive +" " + " positive numbers");
        System.out.println("You entered" + " " + negative +" " + " negative numbers");
        System.out.println("You entered" + " " + nul + " " + " null numbers");
    }



    }

