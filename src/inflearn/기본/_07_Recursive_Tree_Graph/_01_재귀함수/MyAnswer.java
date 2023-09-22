package inflearn.기본._07_Recursive_Tree_Graph._01_재귀함수;

import java.io.*;

public class MyAnswer {
    public static int[] answer;

    public void recursion(int n, int start) {
        if (start > n) return;
        answer[start - 1] = start;
        recursion(n, start + 1);
    }

    public int[] solution(int n) {
        answer = new int[n];
        recursion(n, 1);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int x : T.solution(n)) System.out.print(x + " ");
    }
}
