package class_load;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/7
 * @time 8:54 下午
 */
class Tester {
    static {
        System.out.println("Tester 类的静态初始化块");
    }
}

public class ClassLoadTest {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        cl.loadClass("class_load.Tester");
        System.out.println("系统加载 Tester 类");
        Class.forName("class_load.Tester");
    }
}
