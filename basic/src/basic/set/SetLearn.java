package basic.set;

import java.util.HashSet;
import java.util.Set;

/**
 * description:
 *
 * @author Michael
 * @date 2020/6/30
 * @time 11:37 下午
 */
public class SetLearn {
    public static void main(String[] args) {
        Set<Integer> seen = new HashSet<>();
        // 集合未出现 1，返回 true
        System.out.println(seen.add(1));
        // 添加已出现的元素，返回 false
        System.out.println(seen.add(1));
    }
}
