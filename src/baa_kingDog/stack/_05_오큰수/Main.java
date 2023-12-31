package baa_kingDog.stack._05_오큰수; // BOJ17298 - G4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    private String solution(int n, int[] data) {
        StringBuilder result = new StringBuilder();
        int[] numbers = new int[n];
        Arrays.fill(numbers, -1);
        Stack<Integer> stack = new Stack<>();

        for (int index = 0; index < n; index++) {
            while (!stack.isEmpty() && data[stack.peek()] < data[index]) {
                numbers[stack.peek()] = data[index];
                stack.pop();
            }
            stack.push(index);
        }

        for (int num : numbers) {
            result.append(num).append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] data = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.print(m.solution(n, data));
    }

}
