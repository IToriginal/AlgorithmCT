package inflearn.기본._06_Sorting_Searching._04_LeastRecentlyUsed;

import java.util.Scanner;

public class Answer {
    public int[] solution(int s, int[] arr) {
        int[] answer = new int[s];
        for (int x : arr) {
            int pos = -1;

            for (int i = 0; i < s; i++) {
                if (x == answer[i]) {
                    pos = i;
                }
            }

            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    answer[i] = answer[i - 1];
                }
            }
            answer[0] = x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for(int x : T.solution(s, arr)) System.out.print(x + " ");
    }
}
