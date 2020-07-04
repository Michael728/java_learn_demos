package leetcode;

import org.jcp.xml.dsig.internal.dom.DOMExcC14NMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 *
 * @author Michael
 * @date 2020/7/1
 * @time 11:43 下午
 */
public class GroupAnagrams_49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        Map<String, List> result = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList());
            }
            result.get(key).add(s);
        }
        return new ArrayList(result.values());
    }

    public static void main(String[] args) {
        String[] demo =  {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(demo));
    }
}
