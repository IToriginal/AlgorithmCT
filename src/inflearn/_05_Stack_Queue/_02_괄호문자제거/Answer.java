package inflearn._05_Stack_Queue._02_괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Answer {
    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == ')') while (stack.pop() != '(');
            else stack.push(x);
        }

        for (int i = 0; i < stack.size(); i++) answer += stack.get(i);
        return answer;
    }

    public static void main(String[] args){
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
