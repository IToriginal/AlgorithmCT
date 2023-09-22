package inflearn.기본._02_Array._05_소수_에라토스테네스체;

import java.util.*;

public class Answer {
    public int solution(int n) {
        int answer = 0;
        int[] chk = new int[n + 1];
        for (int i = 2; i < n; i++) {
            if (chk[i] == 0) {
                answer++;
                for (int j = i; j < n; j += i) chk[j] = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
