package inflearn.응용._01_시뮬레이션_구현._05_최대길이바이토닉수열;

import java.util.*;

public class Answer {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;
        ArrayList<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < n - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                peaks.add(i);
            }
        }
        for (int x : peaks) {
            int left = x;
            int right = x;
            int cnt = 1;
            while (left - 1 >= 0 && nums[left - 1] < nums[left]) {
                left--;
                cnt++;
            }
            while (right + 1 < n && nums[right] > nums[right + 1]) {
                right++;
                cnt++;
            }
            answer = Math.max(answer, cnt);
        }
        return answer;
    }
    public static void main(String[] args){
        Answer T = new Answer();
        System.out.println(T.solution(new int[]{1, 3, 2, 5, 7, 4, 2, 5, 1}));
        System.out.println(T.solution(new int[]{1, 1, 2, 3, 5, 7, 4, 3, 1, 2}));
        System.out.println(T.solution(new int[]{3, 2, 1, 3, 2, 4, 6, 7, 3, 1}));
        System.out.println(T.solution(new int[]{1, 3, 1, 2, 1, 5, 3, 2, 1, 1}));
    }
}
