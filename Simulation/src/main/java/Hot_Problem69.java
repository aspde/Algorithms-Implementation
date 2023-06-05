
/**
 * x 的平方根
 */
public class Hot_Problem69 {

    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int ans = 0;

        while(left <= right) {
            int middle = left + ((right - left) >> 1);
            if(middle <= x / middle) {
                left = middle + 1;
                ans = middle;
            } else {
                right = middle - 1;
            }
        }
        return ans;
    }
}
