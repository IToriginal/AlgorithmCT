package inflearn._06_Sorting_Searching._08_이분검색;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        for (int x : arr) {
            answer++;
            if (x == m) break;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int n = Integer.parseInt(input1[0]);
        int m = Integer.parseInt(input1[1]);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(input2[i]);
        System.out.println(T.solution(n, m, arr));

    }
}
