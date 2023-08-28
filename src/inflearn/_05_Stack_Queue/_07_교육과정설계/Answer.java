package inflearn._05_Stack_Queue._07_교육과정설계;

import java.util.*;

public class Answer {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char c : need.toCharArray()) Q.offer(c);
        for (char c : plan.toCharArray()) {
            if (Q.contains(c)) {
                if (c != Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String need = sc.next();
        String plan = sc.next();
        System.out.println(T.solution(need, plan));
    }
}
