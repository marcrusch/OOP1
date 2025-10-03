import java.util.Random;

public class RecursiveSum {
	public static void main(String[] args) {
		int[] series = randomSeries(1000);
        System.out.println(sum(series));
	}

    public static int sum(int[] values) {
        return sum(values, 0, 0);
    }
    public static int sum(int[] values, int index, int agg) {
        if(index>values.length-1) return agg;
        return sum(values, index+1, agg+values[index]);
    }
	
	static int[] randomSeries(int amount) {
		Random random = new Random(4711);
		int[] series = new int[amount];
		for (int index = 0; index < amount; index++) {
			series[index] = random.nextInt(10);
		}
		return series;
	}
}
