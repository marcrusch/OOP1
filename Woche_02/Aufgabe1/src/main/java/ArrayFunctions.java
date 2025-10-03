import java.util.Arrays;

public class ArrayFunctions {
	public static void print(int[] values) {
        System.out.println(Arrays.toString(values));
	}
    public static int[] revert(int[] values) {
        if(values == null || values.length == 0) {
            return values;
        }
        int[] revertedArray = new int[values.length];
        for(int i = values.length-1;i>=0;i--) {
            revertedArray[revertedArray.length-1-i] = values[i];
        }
        return revertedArray;
    }
    public static boolean ascendinglySorted(int[] values) {
        if(values == null) {
            return false;
        }
        boolean isAscending = true;
        for(int i=0;i<values.length-1;i++) {
            if (values[i] >= values[i + 1]) {
                isAscending = false;
                break;
            }
        }
        return isAscending;
    }
    public static boolean descendinglySorted(int[] values) {
        if(values == null) {
            return false;
        }
        boolean isDescending = true;
        for(int i=0;i<values.length-1;i++) {
            if (values[i] <= values[i + 1]) {
                isDescending = false;
                break;
            }
        }
        return isDescending;
    }

}
