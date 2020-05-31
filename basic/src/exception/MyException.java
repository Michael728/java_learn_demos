package exception;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/9
 * @time 10:27 下午
 */
public class MyException  extends Exception{
    // 传递数字 > 10
    private int detail;

    public MyException(int a){
        this.detail = a;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
