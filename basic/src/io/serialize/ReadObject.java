package io.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/1
 * @time 6:43 下午
 */
public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("out.txt"))) {
            Person person = (Person)ois.readObject();
            System.out.println(person);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
