package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * description: demo
 *
 * @author Michael
 * @date 2020/7/26
 * @time 5:59 下午
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/michael/Documents/010-Code/010-Github-Own/java_learn_demos/basic/src/io/FileInputStreamTest.java");
        byte[] bbuf = new byte[1];
        int hasRead = 0;
        StringBuffer read = new StringBuffer();
        while ((hasRead = fis.read(bbuf)) > 0) {
            System.out.println(new String(bbuf, 0, hasRead));
            // 这种方法也能打印字节数组的字符串内容
            System.out.println(new String(bbuf));
            // 因为不是一次性读出的全部内容，用这个方法拼接获取全部内容
            read.append(new String(bbuf, 0, hasRead));
        }
        fis.close();
        System.out.println(read.toString());
    }
}
