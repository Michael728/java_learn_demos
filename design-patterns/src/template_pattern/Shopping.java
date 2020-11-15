package template_pattern;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/28
 * @time 11:49 下午
 */
public class Shopping {
    public static void main(String[] args) {
        AbstractShoppingTemplate carShopping = new CarShopping();
        carShopping.templateMethodShooping();
        System.out.println("========");
        AbstractShoppingTemplate houseShopping = new HoseShopping();
        houseShopping.templateMethodShooping();
    }
}
