package thread;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/10
 * @time 9:58 下午
 */
public class SecondThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().hashCode());
        System.out.println("run: " + Thread.currentThread().getState());
    }

    public static void main(String[] args) {
        SecondThread sec = new SecondThread();
        Thread t1 = new Thread(sec, "Runnable线程");
        System.out.println("main: t1->" + t1.getState());
        t1.start();
        System.out.println("t1 started");
        System.out.println("main: t1->" + t1.getState());
        System.out.println("main: t1->" + t1.getState());
        System.out.println("main: t1->" + t1.getState());
        System.out.println("main: t1->" + t1.getState());
        System.out.println("main: t1->" + t1.getState());
        System.out.println("main: t1->" + t1.getState());
        System.out.println("main: t1->" + t1.getState());
        System.out.println("main: t1->" + t1.getState());
        System.out.println("main: t1->" + t1.getState());
        System.out.println("main: t1->" + t1.getState());
        System.out.println("main: t1->" + t1.getState());
    }
}
