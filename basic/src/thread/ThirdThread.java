package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/10
 * @time 10:26 下午
 */
public class ThirdThread {
    public static void main(String[] args) {
        ThirdThread rt = new ThirdThread();
//        这里使用 lambda 表达式直接创建了 Callable 对象
//        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) () -> {
//            int i = 0;
//            for (; i < 100; i++) {
//                System.out.println(Thread.currentThread().getName() + "变量" + i);
//            }
//            return i;
//        });
        // 不用匿名内部类的方式更易理解一点
        CallableDemo callableDemo = new CallableDemo();
        FutureTask<Integer> task = new FutureTask<>(callableDemo);
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "变量" + i);
            if (20 == i) {
                new Thread(task, "有返回值的线程").start();
            }
        }
        try {
            System.out.println("子线程的返回值：" + task.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class CallableDemo implements Callable {
    int i = 0;

    @Override
    public Integer call() throws Exception {
        for (; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "变量" + i);
        }
        return i;
    }
}
