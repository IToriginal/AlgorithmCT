package inflearn.기본._05_Stack_Queue._01_올바른괄호;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public String solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (char x : arr) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if (stack.isEmpty()) return "YES";
        else return "NO";
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(T.solution(s));
    }
}
