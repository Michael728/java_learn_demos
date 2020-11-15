package reflect;

import java.lang.reflect.Field;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/8
 * @time 11:14 上午
 */


class Person {
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class FieldTest {
    public static void main(String[] args) throws Exception {
        // 创建一个 Person 对象
        Person p = new Person();
        // 获取 Class 对象
        Class<Person> personClazz = Person.class;
        // 使用 getDeclaredField() 方法获取 private 类型的成员变量
        Field nameFiled = personClazz.getDeclaredField("name");
        // 能够获取到并不代表能够访问成员变量，需要设置可访问才行，否则会报错：
        // Class reflect.FieldTest can not access a member of class reflect.Person with modifiers "private"
        nameFiled.setAccessible(true);
        nameFiled.set(p, "Michael");
        Field ageFiled = personClazz.getDeclaredField("age");
        ageFiled.setAccessible(true);
        // 调用 setInt() 方法为 p 对象的 age 成员变量设置值
        // ageFiled.setInt(p, 30);
        ageFiled.set(p, 30);
        System.out.println(p);

    }
}

