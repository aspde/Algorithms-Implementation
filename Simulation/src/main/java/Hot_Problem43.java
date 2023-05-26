
/**
 * 字符串相乘
 */
public class Hot_Problem43 {

    public String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }

        int length1 = num1.length() - 1;
        int length2 = num2.length() - 1;
        char[] char1 = num1.toCharArray();
        char[] char2 = num2.toCharArray();

        int[] value = new int[char1.length + char2.length];

        int index;
        for (int i = length1; i >= 0; i--) {
            for (int j = length2; j >= 0; j--) {
                index = length1 - i + length2 - j;
                value[index] += (char1[i] - '0') * (char2[j] - '0');
            }
        }
        for (int i = 0; i < value.length - 1; i++) {
            value[i + 1] += value[i] / 10;
            value[i] = value[i] % 10;
        }

        index = value.length - 1;
        while(value[index] == 0) {
            index--;
        }

        StringBuilder sb = new StringBuilder();
        while(index >= 0) {
            sb.append(value[index--]);
        }
        return sb.toString();
    }
}
