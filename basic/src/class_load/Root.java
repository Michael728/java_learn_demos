package class_load;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/5
 * @time 8:57 下午
 */
public class Root {
    static {
        int root = 1;
        System.out.println("Root 的类初始化块");
    }

    {
        System.out.println("Root 的实例初始化块");
    }

    public Root() {
        System.out.println("Root 的无参构造器");
    }
}
