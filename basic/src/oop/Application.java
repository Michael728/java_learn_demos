package oop;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/8
 * @time 9:15 下午
 */
public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        Outer outer = new Outer();
        Outer.Inner innter = outer.new Inner();
        innter.in();

    }
}
