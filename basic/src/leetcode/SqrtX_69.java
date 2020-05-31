package leetcode;

/**
 * description: x 的平方根
 *
 * URL: https://leetcode-cn.com/problems/sqrtx/
 *
 * @author Michael
 * @date 2020/3/24
 * @time 11:28 下午
 */
public class SqrtX_69 {
    public static int mySqrt(int x) {
        long left = 0;
        long right = x/2;
        while (left < right){
            long mid = left + (right - left+1)>>>1;
            long square = mid * mid;
            if (square > x){
                right = mid;
            } else if (square < x){
                left = mid +1;
            }
            else {
                return (int)mid;
            }
        }
        return (int)left;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
}
