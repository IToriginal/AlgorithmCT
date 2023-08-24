package inflearn._04_HashMap_HashSet_TreeSet._03_매출액의종류;

import java.io.*;
import java.util.*;

public class MyAnswer2 {
    public int[] solution(int n, int k, int[] arr) {
        int[] answer = new int[n - k + 1];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer[0] = map.size();

        for (int i = k; i < n; i++) {
            // 맨 왼쪽 제외
            map.put(arr[i - k], map.getOrDefault(arr[i - k], 0) - 1);
            // key의 value가 0이라면 window에서 삭제
            if (map.get(arr[i - k]) == 0) map.remove(arr[i - k]);
            // 맨 오른쪽 인덱스 값 추가
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            answer[i - k + 1] = map.size();
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer2 T = new MyAnswer2();
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