package array;

import javax.sound.midi.Soundbank;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/8
 * @time 12:17 下午
 */
public class P51Array {
    public static void main(String[] args) {
        int[] demo = reverse(new int[]{1, 2, 3, 4, 5});
        for (int i : demo) {
            System.out.print(i+"\t");
        }
    }

    public static int[] reverse(int[] array) {
        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[length - i - 1];
        }
        return result;
    }
}
