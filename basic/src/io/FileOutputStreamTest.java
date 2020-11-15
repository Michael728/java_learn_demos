package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * description:
 *
 * @author Michael
 * @date 2020/7/26
 * @time 6:13 下午
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        try (
                // 字节输入流
                FileInputStream fis = new FileInputStream("/Users/michael/Documents/010-Code/010-Github-Own/java_learn_demos/basic/src/io/FileOutputStreamTest.java");
                // 字节输出流
                FileOutputStream fos = new FileOutputStream("newFile.txt")
        ) {
            byte[] bbuf = new byte[32];
            int hasRead = 0;
            while ((hasRead = fis.read(bbuf)) > 0) {
                // 将输入流的内容经过输出流保存到文件中
                fos.write(bbuf, 0, hasRead);

            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
