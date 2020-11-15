package io.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/1
 * @time 6:37 下午
 */
public class WriteObject {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("out.txt"))) {
            Person person = new Person("孙悟空", 30);
            oos.writeObject(person);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
