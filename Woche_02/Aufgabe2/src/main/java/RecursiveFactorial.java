public class RecursiveFactorial {
	public static void main(String[] args) {
        System.out.println(doubleFactorial(8));

	}
    private static int doubleFactorial(int n, int agg) {
        if(n <= 2) {
            return agg;
        }
        return doubleFactorial(n-2, agg*(n-2));
    }
    public static int doubleFactorial(int n) {
        if(n>=20) {
            System.out.println("Number must be smaller than 20.");
            return 0;
        }
        if(n <= 2) {
            return n;
        }
        return doubleFactorial(n-2, n*(n-2));
    }
}
