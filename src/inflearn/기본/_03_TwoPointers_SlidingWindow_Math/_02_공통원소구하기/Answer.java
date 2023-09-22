package inflearn.기본._03_TwoPointers_SlidingWindow_Math._02_공통원소구하기;

import java.util.*;

public class Answer {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            }
            else if (a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;
    }

    public static void main(String[] args){
        Answer T = new Answer();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) b[i] = kb.nextInt();
        for(int x : T.solution(n, m, a, b)) System.out.print(x + " ");
    }
}