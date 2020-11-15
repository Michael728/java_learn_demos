package io.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/2
 * @time 5:25 下午
 */
public class PathTest {
    public static void main(String[] args) {
        Path path = Paths.get(".");
        System.out.println("path 里包含的路径数量" + path.getNameCount());
        System.out.println("path 的根路径是：" + path.getRoot());
        Path absolutePath = path.toAbsolutePath();
        System.out.println(absolutePath);
        System.out.println(absolutePath.getRoot());
    }
}
