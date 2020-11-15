import java.util.Arrays;

/**
 * description:
 *
 * @author Michael
 * @date 2020/10/22
 * @time 11:30 下午
 */
public class TwoSum_167 {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int left = i + 1;
            int right = numbers.length - 1;
            int value = target - numbers[i];
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (numbers[mid] < value) {
                    left = mid + 1;
                } else if (numbers[mid] > value) {
                    right = mid - 1;
                } else {
                    return new int[]{i + 1, mid + 1};
                }
            }
        }

        return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 4, 9, 56, 90}, 8)));
    }
}
