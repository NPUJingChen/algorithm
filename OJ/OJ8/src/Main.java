import java.util.*;

/***
 * @author chenjing
 */
public class Main {
    public static void main(String arg[]) {
        Scanner snc = new Scanner(System.in);
        int n = snc.nextInt();
        Main main = new Main();
        System.out.println(main.reorderedPowerOf2(n));
    }

    private static Set<String> set = new HashSet<>();

    static {
        // 先预处理所有2的幂的十进制中0~9出现的频率
        // 一共31个数
        for (int i = 0; i <= 30; i++) {
            set.add(countBits(1 << i));
        }
    }

    public boolean reorderedPowerOf2(int n) {
        // 计算 n 中0~9出现的频率是否有与2的幂相同的
        return set.contains(countBits(n));
    }

    private static String countBits(int num) {
        // 0~9数字出现的频率
        char[] arr = new char[10];
        while (num != 0) {
            arr[num % 10]++;
            num /= 10;
        }
        return new String(arr);
    }
}