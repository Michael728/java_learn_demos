package reflect;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/8
 * @time 11:15 上午
 */
public class Student {
    String name;

    public Student() {
    }

    private Student(String name) {
        System.out.println("My name is: " + name);

    }

    public void hello(String content) {
        System.out.println("name: " + name + " say :" + content);
    }
}
