package inflearn.기본._07_Recursive_Tree_Graph._02_재귀함수를이용한이진수출력;

import java.util.*;

public class Answer {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public void solution(int n) {
        DFS(n);
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        T.solution(sc.nextInt());
    }
}
