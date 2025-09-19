import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;

public class Statistics {
	public static void main(String[] args) {
		double[] series = randomSeries(10000);
        double min = Arrays.stream(series).min().getAsDouble();
        double max = Arrays.stream(series).max().getAsDouble();
        double arithmeticMean = Arrays.stream(series).sum()/series.length;
        double variance = ((double) 1 /series.length)*Arrays.stream(series).map(number -> (number-arithmeticMean)*(number-arithmeticMean)).sum();
        double diff = Math.sqrt(variance);
        System.out.println("Min/Max: " + min + "/" + max);
        System.out.println("Arithmetischer Mittelwert: " + arithmeticMean);
        System.out.println("Varianz: " + variance);
        System.out.println("Standardabweichung: " + diff);

	}
	
	static double[] randomSeries(int amount) {
		double[] series = new double[amount];
		Random random = new Random(4711);
		for (int index = 0; index < amount; index++) {
			series[index] = random.nextDouble();
		}
		return series;
	}
}
