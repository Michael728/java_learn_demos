package array;

import java.util.Arrays;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/8
 * @time 2:40 下午
 */
public class P57Arrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 10, 5, 6};
//        打印的对象的hashCode
        System.out.println(a.toString());
//        利用 Arrays 类中的静态方法 toString 打印数组内容
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
        
        int length = a.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {

        }
    }
}
