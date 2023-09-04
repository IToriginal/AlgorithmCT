package inflearn._07_Recursive_Tree_Graph._03_팩토리얼;

import java.util.*;

public class Answer {
    public int solution(int n) {
        if (n == 1) return 1;
        else return n * solution(n - 1);
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        System.out.println(T.solution(sc.nextInt()));
    }
}
