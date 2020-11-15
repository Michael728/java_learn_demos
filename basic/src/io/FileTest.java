package io;

import java.io.File;
import java.io.IOException;

/**
 * description:
 *
 * @author Michael
 * @date 2020/7/26
 * @time 4:56 下午
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        // 当前路径下创建一个 File 对象
        File file = new File(".");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        File tmpFile = File.createTempFile("aaa", ".txt", file);
        tmpFile.deleteOnExit();
        File newFile = new File(System.currentTimeMillis() + "");
        System.out.println("newFile 对象是否存在：" + newFile.exists());
        newFile.createNewFile();
        newFile.mkdir();
        String[] fileList = file.list();
        System.out.println("====当前路径下所有文件和路径如下====");
        for (String s : fileList) {
            System.out.println(s);
        }
        File[] roots = File.listRoots();
        System.out.println("====系统所有根路径如下====");
        for (File root : roots) {
            System.out.println(root);

        }


    }
}
