package baa_kingDog.stack._01_제로; // BOJ10773 - S4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    private int solution(int k, int[] data) {
        Stack<Integer> stack = new Stack<>();
        for (int num : data) {
            if (num == 0) {
                stack.pop();
            } else {
                stack.add(num);
            }
        }

        return stack.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] data = new int[k];
        for (int i = 0; i < k; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(m.solution(k, data));
    }

}

