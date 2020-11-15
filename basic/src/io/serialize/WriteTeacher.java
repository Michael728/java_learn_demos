package io.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/1
 * @time 6:59 下午
 */
public class WriteTeacher {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.txt"))) {
            Person student = new Person("孙悟空", 500);
            Teacher teacher1 = new Teacher("唐僧", student);
            Teacher teacher2 = new Teacher("菩提祖师", student);
            oos.writeObject(teacher1);
            oos.writeObject(teacher2);
            oos.writeObject(student);
            oos.writeObject(teacher2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
