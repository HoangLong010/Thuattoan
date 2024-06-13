package twoSum;

import java.util.Arrays;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] vector = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    vector[0] = i;
                    vector[1] = j;
                }
            }
        }
        return vector;

    }

    public static void main(String[] args) {
        int num1[] = { 1, 2, 3, 4, 5 };
        int target1 = 6;
        int[] results1 = twoSum(num1, target1);
        System.out.println(Arrays.toString(results1));
    }

}
