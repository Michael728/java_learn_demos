package method;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/8
 * @time 11:31 上午
 */
public class P49MultiParams {
    public static void main(String[] args) {
        add(1, 2, 3);
    }

    public static void add(int ... numbers) {
        if (numbers.length == 0) {
            System.out.println("未输入求和数字！退出");
            return;
        }
        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
