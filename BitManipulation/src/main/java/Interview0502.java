
/**
 * 二进制数转字符串
 */
public class Interview0502 {

    public String printBin(double num) {
        StringBuilder sb = new StringBuilder("0.");
        while(sb.length() <= 32 && num != 0) {
            num *= 2;
            int digit = (int) num;
            sb.append(digit);
            num -= digit;
        }
        return sb.length() <= 32 ? sb.toString() : "ERROR";
    }
}
