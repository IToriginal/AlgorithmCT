package baa_kingDog.stack._05_오큰수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Fail {

    private int[] solution(int n, int[] data) {
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int index = 0; index < n; index++) {
            while (!stack.isEmpty() && data[stack.peek()] < data[index]) {
                result[stack.peek()] = data[index];
                stack.pop();
            }
            stack.push(index);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        Fail f = new Fail();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] data = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int num : f.solution(n, data)) {
            System.out.print(num + " ");
        }
    }

}
