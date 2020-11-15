package template_pattern;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/28
 * @time 11:35 下午
 */
public class HoseShopping extends AbstractShoppingTemplate {

    @Override
    protected void pay() {
        borrow();
        System.out.println("买房，借完钱付款，500 万！");
    }

    private void borrow() {
        System.out.println("买房，钱不够，借钱！");
    }

    @Override
    protected void buy() {
        System.out.println("买房，幸福小家，搞定");
    }
}
