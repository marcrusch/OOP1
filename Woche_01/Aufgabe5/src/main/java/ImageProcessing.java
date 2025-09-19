
public class ImageProcessing {
	static int[][] invert(int[][] pixels) {
        for(int y = 0; y < pixels.length; y++) {
            for(int x = 0; x < pixels[y].length; x++) {
                pixels[y][x] = pixels[y][x]*-1;
            }
        }
		return pixels;
	}
	
	static int[][] rotate(int[][] pixels) {
        int[][] rotatedPixels = new int[pixels[0].length][pixels.length];
        for(int y = 0; y < pixels.length; y++) {
            for(int x = 0; x < pixels[y].length; x++) {
                rotatedPixels[x][rotatedPixels[x].length-1-y] = pixels[y][x];
            }
        }
		return rotatedPixels;
	}
	
	static int[][] mirror(int[][] pixels) {
        int[][] mirroredPixels = new int[pixels.length][pixels[0].length];
        for(int y = 0; y < pixels.length; y++) {
            for(int x = 0; x < pixels[0].length; x++) {
                mirroredPixels[y][mirroredPixels[y].length-1-x] = pixels[y][x];
            }
        }
		return mirroredPixels;
	}
	
	static int[][] gray(int[][] pixels) {
		// optional task (advanced)
		return pixels;
	}
}
