package inflearn.기본._07_Recursive_Tree_Graph._06_부분집합구하기_DFS;

import java.util.*;

public class Answer {
    public static int n;

    public static int[] ch;

    public void DFS(int L){
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args){
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        ch = new int[n + 1];
        T.DFS(1);
    }
}
