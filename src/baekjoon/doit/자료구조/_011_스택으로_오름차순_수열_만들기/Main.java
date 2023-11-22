package baekjoon.doit.자료구조._011_스택으로_오름차순_수열_만들기; // BOJ1874 - S3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    private Stack<Integer> stack;
    private StringBuilder result;

    private void stackPop() {
        stack.pop();
        result.append("-").append("\n");
    }

    private void stackPush(int number) {
        stack.push(number);
        result.append("+").append("\n");
    }

    public String solution(int n, int[] numbers) {
        result = new StringBuilder();
        stack = new Stack<>();

        int idx = 0, start = 0;
        while (n-- > 0) {
            int target = numbers[idx];
            if (target > start) {
                for (int i = start + 1; i <= target; i++) {
                    stackPush(i);
                }
                start = target;
            } else if (stack.peek() != target) {
                return "NO";
            }
            idx++;
            stackPop();
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(T.solution(n, numbers));
    }

}
