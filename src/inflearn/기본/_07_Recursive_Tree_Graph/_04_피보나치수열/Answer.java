package inflearn.기본._07_Recursive_Tree_Graph._04_피보나치수열;

import java.util.*;

public class Answer {
    public int DFS(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else return DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args){
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) System.out.print(T.DFS(i) + " ");
    }
}
