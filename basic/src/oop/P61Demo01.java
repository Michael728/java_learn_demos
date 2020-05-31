package oop;

import java.nio.channels.IllegalChannelGroupException;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/8
 * @time 6:05 下午
 */

// 值传递
public class P61Demo01 {
    public static void main(String[] args) {
        sayHello();
        int a=1;
        System.out.println(a);
        change(a);
        System.out.println(a);
        System.out.println(1!=2);
    }

    public static String sayHello() {
        return "Hello World";
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void change(int a){
        a = 10;
    }
}
