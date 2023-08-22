package inflearn._03_TwoPointers_SlidingWindow_Math._02_공통원소구하기;

import java.io.*;
import java.util.*;

/**
 * 2023. 08. 22 (화) - 1차 실패,, 테스트케이스 1개에서 Time Limit Exceeded
 */
public class MyAnswer {
    public int[] solution(int n, int m, int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    set.add(arr1[i]);
                    break;
                }
            }
        }

        int[] answer = new int[set.size()];
        int index = 0;
        for (int x : set) {
            answer[index] = x;
            index++;
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        String[] input1 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        for (int x : T.solution(n, m ,arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
