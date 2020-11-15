package io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * description:
 *
 * @author Michael
 * @date 2020/7/26ØØ
 * @time 6:22 下午
 */
public class FileWriterTest {
    public static void main(String[] args) {
        try (
                FileWriter fw = new FileWriter("poem1.txt");
        ) {
            fw.write("静夜思 - 李白 \n");
            fw.write("床前明月光 \n");
            fw.write("疑是地上霜");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
