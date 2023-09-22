package inflearn.응용._01_시뮬레이션_구현._05_최대길이바이토닉수열;

import java.util.*;

public class MyAnswer {
    public int solution(int[] nums){
        int answer = 0;
        int len = nums.length;
        List<Integer> targetIndex = new ArrayList<>();
        for (int i = 1; i < len - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) targetIndex.add(i);
        }

        for (int index : targetIndex) {
            int left = index;
            int rigth = index;
            int count = 1;
            while (left - 1 >= 0 && nums[left] > nums[left - 1]) {
                left--;
                count++;
            }
            while (rigth + 1 < len && nums[rigth] > nums[rigth + 1]) {
                rigth++;
                count++;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }

    public static void main(String[] args){
        MyAnswer T = new MyAnswer();
        System.out.println(T.solution(new int[]{1, 3, 2, 5, 7, 4, 2, 5, 1}));
        System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
        System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
        System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
    }
}
