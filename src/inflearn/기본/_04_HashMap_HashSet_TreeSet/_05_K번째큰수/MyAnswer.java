package inflearn.기본._04_HashMap_HashSet_TreeSet._05_K번째큰수;

import java.io.*;
import java.util.*;

/**
 * 2023. 08. 24 (목): 1차 구현 실패
 */
public class MyAnswer {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    ts.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        System.out.println(ts);
        int cnt = 0;
        for (int x : ts) {
            cnt++;
            if (cnt == k) answer = x;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }

        System.out.println(T.solution(n, k, arr));
    }
}
