package class_load;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/5
 * @time 11:58 下午
 */
public class InstanceTest {
    {
        a = 1;
    }

    int a = 2;

    public static void main(String[] args) {
        System.out.println(new InstanceTest().a);
    }
}
