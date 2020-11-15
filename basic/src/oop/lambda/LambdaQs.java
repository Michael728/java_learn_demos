package oop.lambda;

/**
 * description:
 *
 * @author Michael
 * @date 2020/7/4
 * @time 6:05 下午
 */

interface Eatable {
    void taste();
}

interface Flyable {
    void fly(String weather);
}

interface Addable {
    int add(int a, int b);
}


public class LambdaQs {
    // 调用该方法需要传入一个 Eatable 类型的对象
    public void eat(Eatable e) {
        System.out.println(e);
        e.taste();
    }

    // 调用该方法需要传入 Flyable 类型的对象
    public void drive(Flyable f) {
        System.out.println("我正在驾驶：" + f);
        f.fly("「夏日晴天」");
    }

    // 调用该方法需要 Addable 类型的对象
    public void calc(Addable add) {
        System.out.println("5 + 3 = " + add.add(5, 3));
    }

    public static void main(String[] args) {
        LambdaQs lq = new LambdaQs();
        // Lambda 表达式的代码块只有一句，因此省略了花括号
        lq.eat(() -> System.out.println("雪糕的味道不错！"));
        // Lambda 表达式的形参只有一个参数，因此省略了圆括号
        lq.drive(weather -> {
            // 对接口中抽象方法 fly 的重写
            System.out.println("今天天气是：" + weather);
            System.out.println("飞机平稳飞行！");
        });
        // Lambda 表达式只有一条语句，即使该表达式需要返回值，也可以省略 return
        lq.calc((a, b) -> a + b);
        // 如果不用 Lambda 表达式，就需要如下匿名类的方式去重写抽象方法
        lq.calc(new Addable() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        });

        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };
        r.run();

        Object r2 = (Runnable)() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };
    }
}
