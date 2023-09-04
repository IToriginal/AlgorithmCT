package inflearn._07_Recursive_Tree_Graph._04_피보나치수열;

import java.io.*;

public class MyAnswer {
    public static int[] fibo;

    private int recursion(int n) {
        if (n <= 1) return 1;
        else {
            if (fibo[n] != 0) return fibo[n];
            else return fibo[n] = recursion(n - 1) + recursion(n - 2);
        }
    }

    public int[] solution(int n) {
        fibo = new int[n];
        for (int i = 0; i < n; i++) fibo[i] = recursion(i);
        return fibo;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int x : T.solution(n)) System.out.print(x + " ");
    }
}
