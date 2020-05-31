package exception;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/9
 * @time 10:30 下午
 */
public class TestMyException {
    public static void main(String[] args) {
        try {
            test(10);
        } catch (MyException e) {
            e.printStackTrace();
            // e 这里调用了我们自定义的 toString 方法
            System.out.println("MyException => " + e);
        }
        System.out.println("Over");
    }

    static void test(int a) throws MyException {
        System.out.println("传递的参数为： " + a);
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("OK");
    }
}
