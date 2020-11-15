package io.serialize;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * description: 对象引用的序列化
 *
 * @author Michael
 * @date 2020/8/1
 * @time 7:02 下午
 */
public class ReadTeacher {
    public static void main(String[] args) {
        InputStream in;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("teacher.txt"))) {
            Teacher teacher1 = (Teacher) ois.readObject();
            Teacher teacher2 = (Teacher) ois.readObject();
            Person person = (Person) ois.readObject();
            Teacher teacher3 = (Teacher) ois.readObject();
            System.out.println("teacher1 的 student 引用和 person 是否相同：" + (teacher1.getStudent() == person));
            System.out.println("teacher2 的 student 引用和 person 是否相同：" + (teacher2.getStudent() == person));
            System.out.println("teacher2 是否和 teacher3 同一对象：" + (teacher2 == teacher3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
