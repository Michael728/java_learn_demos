package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * description:
 *
 * @author Michael
 * @date 2020/4/28
 * @time 11:35 下午
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("x");
        test.add(2,"m");
        String a = test.get(1);
        System.out.println(a);
    }
}
