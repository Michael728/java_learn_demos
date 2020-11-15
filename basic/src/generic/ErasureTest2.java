package generic;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;

/**
 * description: 泛型的擦除和转换
 *
 * @author Michael
 * @date 2020/7/8
 * @time 11:15 下午
 */
public class ErasureTest2 {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(6);
        li.add(9);
        // 类型擦除
        List lis = li;
        // Java 允许直接把 List 对象赋给 List<Type> 类型的变量
        // 只是会发出"未经检查的转换"的警告
        // Unchecked assignment: 'java.util.List' to 'java.util.List<java.lang.String>'
        List<String> ls = lis;
        // 实际上 lis 变量引用的是 List<Integer> 集合
        // 因此视图把集合里的元素当成 String 类型的对象取出时，就会报异常
        // 下面语句会报 ClassCastException 异常，java.lang.Integer cannot be cast to java.lang.String
        // 编译器本来期待它返回的是一个 String 类型的变量，结果却是 Integer 类型的变量
         System.out.println(ls.get(0));

    }
}
