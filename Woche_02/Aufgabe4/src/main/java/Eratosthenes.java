import java.util.Arrays;

public class Eratosthenes {
	private static final int PRIMES_UP_TO = 100;
	
	public static void main(String[] args) {
		// The numbers in the sieve start with 2,
		// so we reduce the array length accordingly.

        int[] sieve = createArray(PRIMES_UP_TO-1);

        sieve = getSievedArray(sieve);

		// Now let's look at each number in the array:

		System.out.print("Found the following prime numbers: ");

		for(int i = 0; i < sieve.length; i++) {
			int primeNumber = sieve[i];
			if(primeNumber == -1) {
				continue;
			}				
			System.out.print(primeNumber);
            if(i<sieve.length-1) {
                System.out.print(", ");
            }
		}
	}
    public static int[] createArray(int n) {
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++) {
            array[i] = i + 2;
        }
        return array;
    }
    public static int[] getSievedArray(int[] values) {
        for(int i = 0; i < values.length; i++) {
            int primeNumber = values[i];
            if(primeNumber == -1) {
                continue;
            }
            int numberToCross = primeNumber * 2;
            while(numberToCross <= PRIMES_UP_TO) {
                int indexToCross = numberToCross - 2;
                values[indexToCross] = -1;
                numberToCross += primeNumber;
            }
        }
        return Arrays.stream(values).filter(n -> n >1).toArray();
    }
}
