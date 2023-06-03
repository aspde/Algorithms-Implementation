import java.util.HashSet;
import java.util.Set;

/**
 * 快乐数
 */
public class Problem202 {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }

    private int getNextNumber(int n) {
        int result = 0;
        while(n > 0) {
            int temp = n % 10;
            result += temp * temp;
            n = n / 10;
        }
        return result;
    }
}
