package inflearn.기본._01_String._11_문자열압축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    private static String s;

    private String solution() {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char[] alphabetics = s.toCharArray(); // K, K, H, S, S, S, S, S, S, S, E

        for (char c : alphabetics) {
            if (stack.isEmpty() || stack.peek() == c) {
                stack.push(c);
            } else {
                int count = stack.size();
                if (stack.size() != 1) {
                    result.append(stack.pop()).append(count);
                } else {
                    result.append(stack.pop());
                }
                stack.clear();
                stack.push(c);
            }
        }

        if (!stack.isEmpty()) {
            int count = stack.size();
            if (stack.size() != 1) {
                result.append(stack.pop()).append(count);
            } else {
                result.append(stack.pop());
            }
        }

        return result.toString(); // K2HS7E
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine(); // KKHSSSSSSSE
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }
}
