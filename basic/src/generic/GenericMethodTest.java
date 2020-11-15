package generic;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import sun.jvm.hotspot.debugger.win32.coff.COFFLineNumber;

import java.util.ArrayList;
import java.util.Collection;

/**
 * description:
 *
 * @author Michael
 * @date 2020/7/7
 * @time 11:13 下午
 */
public class GenericMethodTest {
    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<>();
        fromArrayToCollection(oa, co);
        String[] sa = new String[100];
        Collection<String> cs = new ArrayList<>();
        fromArrayToCollection(sa, cs);
        fromArrayToCollection(sa, co);
        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList<>();
        fromArrayToCollection(ia, cn);
        fromArrayToCollection(fa, cn);
        fromArrayToCollection(na, cn);
        fromArrayToCollection(na, co);
        // T 代表 Sting,但是 na 是一个 Number 数组
        // Number 既不是 String 类型，也不是它的子类
        // 因此，下面这行会编译错误
        // fromArrayToCollection(na, cs);
    }
}
