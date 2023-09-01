package inflearn._06_Sorting_Searching._09_뮤직비디오;

import java.io.*;
import java.util.*;

/**
 * 2023. 08. 31 (목): 1차 구현 실패
 */
public class MyAnswer {
    public int check(int[] arr, int value) {
        int count = 1;
        int sum = 0;

        for (int x : arr) {
            sum += x;

            if (sum > value) {
                count++;
                sum = x;
            }
        }

        return count;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int minRange = Arrays.stream(arr).max().getAsInt();
        int maxRange = Arrays.stream(arr).sum();

        while (minRange <= maxRange) {
            int target = (minRange + maxRange) / 2;
            int check = check(arr, target);

            if (check <= m) {
                answer = target;
                maxRange = target - 1;
            } else minRange = target + 1;

        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int n = Integer.parseInt(input1[0]); // 9
        int m = Integer.parseInt(input1[1]); // 3
        int[] arr = new int[n]; // {1, 2, 3, 4, 5, 6, 7, 8, 9}
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(input2[i]);

        System.out.println(T.solution(n, m, arr));
    }
}
