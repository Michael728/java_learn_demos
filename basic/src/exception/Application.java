package exception;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/9
 * @time 9:09 下午
 */
public class Application {
    public static void main(String[] args) {
        try {
//            System.out.println(1 / 0);
            a();
        } catch (ArithmeticException e) {
            System.out.println("算术异常 ArithmeticException: "+e.getMessage());
            throw new ArithmeticException("哎呀呀，计算出错啦！");
//            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("漏网之鱼 Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (Error e) {
            System.out.println("漏网之鱼 Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("END~");
        }
        System.out.println("Ok");

        System.out.println("Hello World");
    }

    public static void a() {
        b();
    }

    public static void b() {
        a();
    }
}
