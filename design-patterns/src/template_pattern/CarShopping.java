package template_pattern;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/28
 * @time 11:32 下午
 */
public class CarShopping extends AbstractShoppingTemplate {

    @Override
    protected void pay() {
        eCard();
        System.out.println("买车，付款喽，花了我 100 万！");
    }

    private void eCard() {
        System.out.println("买车，刷卡结算啦！");
    }

    @Override
    protected void buy() {
        drive();
        System.out.println("买车，爽，买它！");
    }

    private void drive() {
        System.out.println("买车，试驾喽~");
    }
}
