public class Eratosthenes {
	public static void main(String[] args) {
        int[] arr = createArray(100);
        int[] sievedArr = sieve(arr);
        for (int n: sievedArr) {
            if(n==0) continue;
            System.out.println(n);
        }
    }
    private static int[] createArray(int number) {
        int[] arr = new int[number];
        for (int i = 2; i<=number;i++) {
            arr[i-1]=i;
        }
        return arr;
    }
    private static int[] sieve(int[] arr) {
        int[] sievedArr = arr;

        for (int number: arr) {
            if(number==0) continue;
            for(int i = number;i<=arr.length-1;i++) {
                if(arr[i]%number==0) {
                    sievedArr[i]=0;
                }
            }
        }
        return sievedArr;
    }
}
