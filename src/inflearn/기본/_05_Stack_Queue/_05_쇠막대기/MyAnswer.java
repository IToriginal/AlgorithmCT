package inflearn.기본._05_Stack_Queue._05_쇠막대기;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char prev = ' ';

        for (char x : s.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                stack.pop();
                if (prev == '(') answer += stack.size();
                else answer++;
            }
            prev = x;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String s = br.readLine();
        String s = "()(((()())(())()))(())";
        String s1 = "(((()(()()))(())()))(()())";
        System.out.println(T.solution(s));
        System.out.println(T.solution(s1));

    }
}
