package inflearn.기본._04_HashMap_HashSet_TreeSet._03_매출액의종류;

import java.io.*;
import java.util.*;

/**
 * 2023. 08. 24 (목): 타임 에러
 */
public class MyAnswer {
    public int[] solution(int n, int k, int[] arr) {
        int[] answer = new int[n - k + 1];

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < k + i; j++) {
                set.add(arr[j]);
            }
            answer[i] = set.size();
            set.clear();
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

        for (int x : T.solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}