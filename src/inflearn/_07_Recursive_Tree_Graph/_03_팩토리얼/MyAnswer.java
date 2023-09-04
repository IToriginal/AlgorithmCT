package inflearn._07_Recursive_Tree_Graph._03_팩토리얼;

import java.io.*;

public class MyAnswer {
    public static int result = 1;

    public void recursion(int n) {
        if (n == 0) return;
        else {
            result *= n;
            recursion(n - 1);
        }
    }

    public int solution(int n) {
        recursion(n);
        return result;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(T.solution(n));
    }
}
