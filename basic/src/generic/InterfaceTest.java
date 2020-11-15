package generic;

/**
 * description: 泛型 类型推断
 *
 * @author Michael
 * @date 2020/7/8
 * @time 10:42 下午
 */

class MyUtil<E> {
    public static <Z> MyUtil<Z> nil(){
        return null;
    }

    public static <Z> MyUtil<Z> cons(Z head, MyUtil<Z> tail) {
        return null;
    }
    E head() {
        return null;
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        // 通过方法赋值的目标参数来推断泛型为 String
        MyUtil<String> ls = MyUtil.nil();
        // 上面那种使用方式即可，无需像下面这种方式制定泛型类型
        MyUtil<String> mu = MyUtil.<String>nil();
        // 调用 cons 方法所需的参数类型判断泛型为 Integer
        MyUtil.cons(42, MyUtil.nil());
        // 无需使用下面语句指定泛型类型
        MyUtil.cons(42, MyUtil.<Integer>nil());
    }
}
