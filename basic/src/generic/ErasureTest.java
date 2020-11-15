package generic;

import java.util.ArrayList;

/**
 * description:
 *
 * @author Michael
 * @date 2020/7/8
 * @time 10:54 下午
 */
class Apple<T extends Number> {
    T size;

    public Apple() {
    }

    public Apple(T size) {
        this.size = size;
    }

    public void setSize(T size) {
        this.size = size;
    }

    public T getSize() {
        return this.size;
    }
}


public class ErasureTest {
    public static void main(String[] args) {
        Apple<Integer> a = new Apple<>(6);
        Integer as = a.getSize();
        // 把 a 对象赋给 Apple 变量，丢失尖括号里的类型信息
        // 编译器会丢失 a 对象的泛型信息
        // 类的泛型类型变成泛型参数的上限，此处为 Number
        Apple b = a;
        Number size1 = b.getSize();
        System.out.println(b.getSize() instanceof Integer);
        // 子类可以自然的转换为父类，向上转型
        // 但是父类转换成子类则需要强制转换，因此，下面的语句会编译出错
        // Integer size2 = b.getSize();
    }
}
