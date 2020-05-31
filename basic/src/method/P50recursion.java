package method;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/8
 * @time 12:07 下午
 */
public class P50recursion {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    /**
     * 计算阶乘
     *
     * @param n
     * @return
     */
    public static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return n * f(n - 1);
    }
}
