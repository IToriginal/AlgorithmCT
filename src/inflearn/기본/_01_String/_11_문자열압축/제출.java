package inflearn.기본._01_String._11_문자열압축;

import java.io.*;
import java.util.*;

public class 제출 {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray();

        for (char x : c) {
            if (stack.isEmpty() || stack.peek() == x){
                stack.push(x);
            } else {
                int count = stack.size();
                if (stack.size() != 1) {
                    answer.append(stack.pop()).append(count);
                } else {
                    answer.append(stack.pop());
                }
                stack.clear();
                stack.push(x);
            }
        }

        if (!stack.isEmpty()) {
            int count = stack.size();
            if (stack.size() != 1) {
                answer.append(stack.pop()).append(count);
            } else {
                answer.append(stack.pop());
            }
        }

        return answer.toString();
    }
    public static void main(String[] args) throws IOException {
        제출 T = new 제출();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // KKHSSSSSSSE
        System.out.println(T.solution(input)); // K2HS7E
    }
}
