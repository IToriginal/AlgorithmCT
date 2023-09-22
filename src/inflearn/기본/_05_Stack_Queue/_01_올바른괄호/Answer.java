package inflearn.기본._05_Stack_Queue._01_올바른괄호;

import java.util.*;

public class Answer {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args){
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
