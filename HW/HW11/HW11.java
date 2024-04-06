public class HW11 {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }

        filler(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void filler(int[][] image, int m, int n, int oldColor, int color) {
        if (m >= image.length || n >= image[0].length || m < 0 || n < 0 || n > 50 || image[m][n] != oldColor) {
            return;
        }

        image[m][n] = color;
        filler(image, m - 1, n, oldColor, color);
        filler(image, m + 1, n, oldColor, color);
        filler(image, m, n - 1, oldColor, color);
        filler(image, m, n + 1, oldColor, color);
    }
}
