package oop.lambda;

import javax.swing.*;

/**
 * description:
 *
 * @author Michael
 * @date 2020/7/4
 * @time 7:20 下午
 */
@FunctionalInterface
interface Converter {
    Integer convert(String from);
}

@FunctionalInterface
interface MyTest {
    String test(String a, int b, int c);
}

@FunctionalInterface
interface YourTest {
    // 抽象方法负责根据 String 参数生成一个 JFrame 返回值
    JFrame win(String title);
}


public class LambdaRef {
    public static void main(String[] args) {
        // 1 引用类方法
        // 下面使用 Lambda 表达式创建 Converter 对象
        Converter converter1 = from -> Integer.valueOf(from);
        Integer val = converter1.convert("99");

        // 函数式接口中被实现方法的全部参数传给该类方法作为参数
        Converter converter2 = Integer::valueOf;
        Integer val2 = converter2.convert("100");

        // 2 引用特定对象的实例方法
        // 使用 Lmabda 表达式创建 Converter 对象
        Converter converter3 = from -> "hello michael翔".indexOf(from);

        // 调用 "hello michael翔"的indexOf()实例方法
        // 函数式接口中被实现的全部参数传给该方法作为参数
        Converter converter4 = "hello michael翔"::indexOf;

        // 3 引用某类对象的实例方法
        // 使用 Lambda 表达式创建 MyTest 对象
        MyTest mt = (a, b, c) -> a.substring(b, c);
        String  str = mt.test("Hello World, Hello Michael翔", 2,9);

        // 上面 Lambda 表达式只有一行，因此可以使用如下引用进行替换
        // 函数式接口中被实现方法的第一个参数作为调用者
        // 后面的参数全部传给该方法作为参数
        MyTest str2 = String::substring;

        // 4 引用构造器
        // 使用 Lambda 表达式创建 YourTest 对象
        YourTest yt = a -> new JFrame(a);
        JFrame jf = yt.win("窗口");

        // 使用构造器引用进行替换
        // 函数式接口中被实现方法的全部参数传给该构造器作为参数
        YourTest yt2 = JFrame::new;
        JFrame jf2 = yt.win("窗口2");
    }
}
