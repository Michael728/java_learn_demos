package class_load;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/5
 * @time 9:04 下午
 */
public class Leaf extends Mid {
    static {
        int leaf = 3;
        System.out.println("Leaf 的类初始化块");
    }

    {
        System.out.println("Mid 的实例初始化块");
    }

    public Leaf() {
        super("初始化测试");
        System.out.println("执行Leaf的构造器");
    }
}
