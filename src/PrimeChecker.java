import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void runChecker() {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.print("Enter a number between 2 and 2000000 (or type 0 to exit): ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Exiting program. Goodbye :)!");
                keepRunning = false;
                continue;
            }

            if (number < 2 || number > 2000000) {
                System.out.println("Invalid input. The number must be between 2 and 2000000.");
                continue;
            }

            if (isPrime(number)) {
                System.out.println("Prime!");
            } else {
                System.out.println("Not prime!");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        runChecker();
    }
}
