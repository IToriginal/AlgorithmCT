package leetCode._0001_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                return new int[] {
                        map.get(value), i
                };
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] exam_1 = new int[] {2, 7, 11, 15};
        if (Arrays.equals(s.twoSum(exam_1, 9), new int[]{0, 1})) {
            System.out.println("1번 테스트 케이스 통과");
        } else {
            System.out.println("1번 테스트 케이스 실패");
        }

        int[] exam_2 = new int[] {3, 2, 4};
        if (Arrays.equals(s.twoSum(exam_2, 6), new int[]{1, 2})) {
            System.out.println("2번 테스트 케이스 통과");
        } else {
            System.out.println("2번 테스트 케이스 실패");
        }

        int[] exam_3 = new int[] {3, 3};
        if (Arrays.equals(s.twoSum(exam_3, 6), new int[]{0, 1})) {
            System.out.println("3번 테스트 케이스 통과");
        } else {
            System.out.println("3번 테스트 케이스 실패");
        }

    }

}
