package inflearn.기본._02_Array._07_점수계산;

import java.util.*;

public class Answer {
    public int solution(int n, int[] arr) {
        int answer = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else cnt = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }
}
