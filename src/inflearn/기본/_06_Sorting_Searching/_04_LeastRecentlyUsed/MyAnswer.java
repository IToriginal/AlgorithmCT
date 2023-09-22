package inflearn.기본._06_Sorting_Searching._04_LeastRecentlyUsed;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public int[] solution(int s, int n, int[] arr) {
        int[] answer = new int[s];
        Queue<Integer> Q = new LinkedList<>();

        for (int x : arr) {
            if (!Q.contains(x)) {
                if (Q.size() == s) Q.poll(); // 큐의 가장 오래된 요소를 제거
            } else Q.remove(x); // 이미 캐시에 있을 경우 해당 요소를 제거하여 순서 조정
            Q.offer(x); // 새로운 요소를 추가
        }

        int index = s;
        while (!Q.isEmpty()) {
            answer[--index] = Q.poll();
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");

        int s = Integer.parseInt(input1[0]);
        int n = Integer.parseInt(input1[1]);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input2[i]);
        }

        for (int x : T.solution(s, n, arr)) {
            System.out.print(x + " ");
        }
    }
}
