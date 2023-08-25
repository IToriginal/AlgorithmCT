package inflearn._05_Stack_Queue._04_후위식연산;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) stack.push(x - '0');
            else {
                int b = stack.pop();
                int a = stack.pop();

                if (x == '+') stack.push(a + b);
                else if (x == '-') stack.push(a - b);
                else if (x == '*') stack.push(a * b);
                else stack.push(a / b);
            }
        }
        answer = stack.peek();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(T.solution(s));
    }
}
