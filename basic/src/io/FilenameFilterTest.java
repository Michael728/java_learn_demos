package io;

import java.io.File;

/**
 * description:
 *
 * @author Michael
 * @date 2020/7/26
 * @time 5:17 下午
 */
public class FilenameFilterTest {
    public static void main(String[] args) {
        File file = new File(".");
        String[] nameList = file.list((dir, name) -> name.endsWith(".md") || new File(name).isDirectory());
        for (String s : nameList) {
            System.out.println(s);
        }
    }
}
