package inflearn._07_Recursive_Tree_Graph._02_재귀함수를이용한이진수출력;

import java.io.*;

public class MyAnswer {
    public void recursion(int n) {
        if (n == 0) return;
        else {
            recursion(n / 2);
            System.out.print(n % 2);
        }
    }

    public void solution(int n) {
        recursion(n);
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        T.solution(n);
    }
}
