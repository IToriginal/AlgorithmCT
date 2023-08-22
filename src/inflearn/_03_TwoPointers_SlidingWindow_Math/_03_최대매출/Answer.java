package inflearn._03_TwoPointers_SlidingWindow_Math._03_최대매출;

import java.util.*;

public class Answer {
    public int solution(int n, int k, int[] arr){
        int answer, sum = 0;

        for (int i = 0; i < k; i++) sum += arr[i];
        answer = sum;

        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args){
        Answer T = new Answer();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.print(T.solution(n, k, arr));
    }
}