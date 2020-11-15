package reflect;

import java.lang.reflect.Constructor;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/8
 * @time 11:17 上午
 */
public class ClassTest {
    public static void main(String[] args) {
        Class<Student> clazz = Student.class;
        Constructor[] ctors = clazz.getConstructors();
        for (Constructor ctor : ctors) {
            System.out.println(ctor);
        }
        System.out.println("====");
        Constructor[] ctorsDeclared = clazz.getDeclaredConstructors();
        for (Constructor constructor : ctorsDeclared) {
            System.out.println(constructor);
        }
    }
}
