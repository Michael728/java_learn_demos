package class_load;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/7
 * @time 8:41 下午
 */

class MyTest {
    static {
        System.out.println("静态初始化块");
    }

    static final String compileConstant = System.currentTimeMillis() + "";
}

public class ComileConstantTest {
    public static void main(String[] args) {
        System.out.println(MyTest.compileConstant);
    }
}
