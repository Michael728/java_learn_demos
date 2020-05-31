package method;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/10
 * @time 9:51 下午
 */
public class TestInstanceFor {

    public static void main(String[] args) {
        TestInstanceVariable testInstanceVariable = new TestInstanceVariable();
        testInstanceVariable.test();
        System.out.println("=======");
        System.out.println(testInstanceVariable.i);
    }
}
