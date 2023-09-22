package inflearn.기본._05_Stack_Queue._02_괄호문자제거;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (char x : arr) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else stack.push(x);
        }

        System.out.println(stack);
        for (char x : stack) {
            answer.append(x);
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(T.solution(s));
    }
}
