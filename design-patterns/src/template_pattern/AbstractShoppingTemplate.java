package template_pattern;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/28
 * @time 11:28 下午
 */
public abstract class AbstractShoppingTemplate {


    /**
     * 模板方法
     */
    public final void templateMethodShooping() {
        // 购物
        buy();
        // 付钱
        pay();
        // 回家
        go();
    }

    /**
     * 基本方法：空方法
     */
    private void bye() {
    }

    /**
     * 基本方法：具体方法，子类并不实现或者覆盖！
     */
    private void go() {
        System.out.println("shopping 结束，回家！");
    }

    /**
     * 基本方法：抽象方法
     */
    protected abstract void pay();

    /**
     * 基本方法：抽象方法
     */
    protected abstract void buy();
}
