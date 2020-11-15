package class_load;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/5
 * @time 8:59 下午
 */
public class Mid extends Root {
    static {
        int mid = 2;
        System.out.println("Mid 的类初始化块");
    }

    {
        System.out.println("Mid 的实例初始化块");
    }

    public Mid() {
        System.out.println("Mid 的无参构造器");
    }

    public Mid(String msg) {
        this();
        System.out.println("Mid 的有参构造器，其参数值：" + msg);
    }
}
