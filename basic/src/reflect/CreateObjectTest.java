package reflect;

import java.lang.reflect.Method;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/8
 * @time 6:24 下午
 */
public class CreateObjectTest {

    static Object createObject(String clazzName) throws Exception {
        Class<?> clazz = Class.forName(clazzName);
        return clazz.getConstructor().newInstance();
    }

    static void methodTest(Object target) throws Exception {
        // 通过实例的 `getClass` 方法获取 Class 对象
        Class<?> clazz = target.getClass();
        // 通过 Class 对象获取对应类的 Method 对象
        Method mtd = clazz.getMethod("hello", String.class);
        // 调用 Method 对象的 invoke 方法，传入方法实参
        mtd.invoke(target, "测试");
    }

    public static void main(String[] args) throws Exception {
        Object s = createObject("reflect.Student");
        methodTest(s);
    }
}
