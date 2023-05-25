
/**
 * 字符串相加，相减
 */
public class Hot_Problem415 {

    public String addStrings(String num1, String num2) {
        int length1 = num1.length() - 1;
        int length2 = num2.length() - 1;
        char[] char1 = num1.toCharArray();
        char[] char2 = num2.toCharArray();

        StringBuilder sb = new StringBuilder();
        int remainder = 0;// 计算余数
        while (length1 >= 0 || length2 >= 0) {
            int n1 = length1 >= 0 ? char1[length1--] - '0' : 0;
            int n2 = length2 >= 0 ? char2[length2--] - '0' : 0;
            int num = n1 + n2 + remainder;// 求和对应数字
            remainder = num / 10;// 是否进位
            sb.append(num % 10);// 添加到结果字符串中
        }

        if(remainder == 1) {// 是否还需要进位
            sb.append(remainder);
        }
        return sb.reverse().toString();// 反转即为结果
    }

    public String subtractStrings(String num1, String num2) {

    }
}
