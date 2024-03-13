package baa_kingDog.stack._2493_탑; // BOJ2493 - G5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    private int[] solution(int n, int[] heights) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // 스택이 비어있지 않고 현재 탑의 높이가 스택의 맨 위 탑의 높이보다 큰 경우:
            // 스택에서 맨 위의 탑을 제거 (현재 탑보다 큰 탑을 찾기 위함)
            while (!stack.isEmpty() && heights[stack.peek()] < heights[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] heights = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int h : m.solution(n, heights)) {
            System.out.print(h +" ");
        }
    }

}
