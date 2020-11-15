package reflect;

import java.lang.reflect.Array;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/10
 * @time 10:24 下午
 */
public class ArrayTest {
    public static void main(String[] args) {
        try {
            Object arr = Array.newInstance(String.class, 10);
            Array.set(arr, 5, "反射测试");
            Array.set(arr, 6, "数组学习");
            Object c1 = Array.get(arr, 5);
            Object c2 = Array.get(arr, 6);
            System.out.println(c1);
            System.out.println(c2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
