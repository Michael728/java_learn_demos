package io.serialize;

import java.io.Serializable;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/1
 * @time 6:34 下午
 */
public class Person implements Serializable {
    String name;
    transient int age;

    public Person(String name, int age) {
        System.out.println("有参数的构造器");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
