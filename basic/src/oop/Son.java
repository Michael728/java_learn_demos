package oop;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/11
 * @time 10:12 下午
 */
public class Son extends Father {
    String age;

    public Son(String age) {
        super("michael");
        this.age = age;
    }

    public static void main(String[] args) {
        Son s = new Son("19");
        System.out.println(s.age);
    }
}
