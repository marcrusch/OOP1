import java.util.Scanner;

public class DoubleFactorial {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number < 0 || number >=20) {
            System.out.println("Input not valid");
            return;
        }
        System.out.println(factorial(number));

	}
    public static int factorial(int number) {
        int result = 1;
        for (int i = (number%2-2)*-1;i<=number;i+=2) {
            result*=i;
        }
        return result;
    }
}
