package io.charset;

import java.nio.charset.Charset;
import java.util.SortedMap;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/2
 * @time 5:05 下午
 */
public class CharsetTest {
    public static void main(String[] args) {
        SortedMap<String, Charset> map = Charset.availableCharsets();
        for (String key : map.keySet()) {
            System.out.println(key + "----" + map.get(key));
        }
    }
}
