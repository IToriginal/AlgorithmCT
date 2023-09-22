package inflearn.기본._06_Sorting_Searching._05_중복확인;

import java.util.Scanner;

public class Answer {
    public String solution(int n, int[] arr) {
        String answer = "U";

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                answer = "D";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
