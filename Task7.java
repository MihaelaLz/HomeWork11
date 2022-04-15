import java.util.Scanner;

public class Task7{

        public static void main(String[] args) {

            int attemps = 0;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("PLease enter your password:");
            boolean locked = false;
            int pass = 0;
            final int CORRECT_PASS = 1234;

            String email;
            final String MAIL = "mihaella.stoeva@gmail.com";

            int attempsmail = 0;

            while (pass != CORRECT_PASS && attemps < 3) {
                pass = keyboard.nextInt();
                attemps++;
                if (pass != CORRECT_PASS && attemps < 3) {
                    System.out.println("The password is incorrect! Try again!");
                }
            }
            if (pass == CORRECT_PASS && attemps <= 3) {
                System.out.println("Correct!Welcome back!");
            } else {
                System.out.println("Password is incorrect!You account is locked. ");
                locked = true;
            }

            while (locked) {
                System.out.println("Please enter an e-mail address to send you information how do  recover your account.");
                email = keyboard.next();
                attempsmail++;
                if (!email.matches(MAIL) && attempsmail < 3) {

                    System.out.println(" Incorrect e-mail address.");
                    System.out.println("Please re-enter your e-mail address:");
                    continue;
                }
                if (email.matches("[\\w]+@[\\w]+\\.[a-zA-Z]{2,3}")  && (email.matches(MAIL)) && attempsmail <= 3) {
                    System.out.println("We send to your e- mail address information about recovering your account.");
                    locked = false;
                } else {
                    System.out.println("Your account is blocked for 24 hours!");
                    break;
                }
            }

        }
    }

