package io.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/1
 * @time 7:20 下午
 */
public class TransientTest {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transient.txt"))) {
            Person person = new Person("孙悟空", 500);


            oos.writeObject(person);
            Person p = (Person) ois.readObject();
            System.out.println(p.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
