package array;

import java.util.Arrays;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/8
 * @time 3:04 下午
 */
public class P58Bubble {
    public static void main(String[] args) {
        int[] result = sort(new int[]{2, 1, 4, 3});
        System.out.println(Arrays.toString(result));
    }

    public static int[] sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
