import java.util.Scanner;

public class PrimeTester {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number<=1) {
            System.out.println("Please enter a number larger than 1");
            return;
        }
        boolean isPrime = isPrime(number);
        if(isPrime) {
            System.out.println("Number is prime");
            return;
        }
        System.out.println("Number is not prime");
	}
    public static boolean isPrime(int number) {
        for (int i = 2; i<=number/2-1;i++) {
            if(number%i==0) {
                return false;
            }
        }

        return true;
    }
}
