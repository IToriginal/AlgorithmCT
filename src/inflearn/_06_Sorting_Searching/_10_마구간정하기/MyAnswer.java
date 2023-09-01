package inflearn._06_Sorting_Searching._10_마구간정하기;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public int checkFunction(int[] arr, int value) {
        int count = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= value) {
                count++;
                ep = arr[i];
            }
        }
        return count;
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lp = 1;
        int rp = arr[n - 1];
        while (lp <= rp) {
            int mp = (lp + rp) / 2;
            int checkValue = checkFunction(arr, mp);
            if (checkValue >= c) {
                answer = mp;
                lp = mp + 1;
            } else rp = mp - 1;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int n = Integer.parseInt(input1[0]);
        int c = Integer.parseInt(input1[1]);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(input2[i]);
        System.out.println(T.solution(n, c, arr));
    }
}
