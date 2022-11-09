/**
 * 模拟过程，高频
 */
public class Program59 {

    public int[][] generateMatrix(int n) {

        int[][] result = new int[n][n];
        int count = 1;
        int left = 0;
        int right = n-1;
        int up = 0;
        int down = n-1;

        while(true) {

            for (int i = left; i <= right; i++) {
                result[up][i] = count++;
            }
            if(++up>down) {
                break;
            }
            for (int i = up; i <= down; i++) {
                result[i][right] = count++;
            }
            if(--right<left) {
                break;
            }
            for (int i = right; i >= left; i--) {
                result[down][i] = count++;
            }
            if(--down<up) {
                break;
            }
            for (int i = down; i >= up; i--) {
                result[i][left] = count++;
            }
            if(++left>right) {
                break;
            }
        }

        return result;
    }
}
