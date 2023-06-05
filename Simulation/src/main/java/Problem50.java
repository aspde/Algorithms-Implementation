
/**
 * Pow(x, n)
 */
public class Problem50 {

    public double myPow(double x, int n) {
        long b = n;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
        return myPowHelper(x, b);
    }

    private double myPowHelper(double x, long b) {
        if(b == 0) {
            return 1;
        }
        if(b == 1) {
            return x;
        }
        double t = myPowHelper(x, b / 2);
        if(b % 2 == 1) {
            return t * t * x;
        }
        return t * t;
    }
}
