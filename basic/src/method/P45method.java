package method;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/8
 * @time 11:00 上午
 */
public class P45method {
    public static void main(String[] args) {
        int sum = add(1, 2);
        double sum2 = add(1,2);
        System.out.println(sum2);
    }

    public static int add(int a, int b) {
        System.out.println("方法 int");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("方法 double");
        return a + b;
    }


}
