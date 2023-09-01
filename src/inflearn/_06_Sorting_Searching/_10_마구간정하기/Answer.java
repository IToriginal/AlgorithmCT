package inflearn._06_Sorting_Searching._10_마구간정하기;

import java.util.Arrays;
import java.util.Scanner;

public class Answer {
    public int count(int[] arr, int value) {
        int cnt = 1, ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= value) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int soluion(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1, rt = arr[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(T.soluion(n, c, arr));
    }
}
