package baa_kingDog.stack._6198_옥상_정원_꾸미기; // BOJ6198 - G5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    private long solution(int n, int[] heights) {
        Stack<Integer> stack = new Stack<>();

        long sum = 0;
        for (int index = 0; index < n; index++) {
            while (!stack.isEmpty() && heights[stack.peek()] <= heights[index]) {
               stack.pop();
            }
            sum += stack.size();
            stack.push(index);
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(m.solution(n, heights));
    }

}
