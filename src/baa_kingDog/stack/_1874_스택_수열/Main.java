package baa_kingDog.stack._1874_스택_수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    private StringBuilder result;
    private Stack<Integer> stack;

    private void popNumber() {
        stack.pop();
        result.append("-").append("\n");
    }

    private void pushNumber(int target, int start) {
        for (int num = start + 1; num <= target; num++) {
            stack.push(num);
            result.append("+").append("\n");
        }
    }

    private String solution(int n, int[] data) {
        result = new StringBuilder();
        stack = new Stack<>();

        int start = 0, index = 0;
        while (n-- > 0) {
            int target = data[index];
            index++;

            if (target > start) {
                pushNumber(target, start);
                start = target;
            } else if (stack.peek() != target) {
                return "NO";
            }
            popNumber();
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(m.solution(n, data));
    }

}
