package solvedAc.class2;

import java.io.*;
import java.util.*;
public class _10773_Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int testCase = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < testCase; i++) {
            int number = Integer.parseInt(br.readLine());

            if (number != 0) {
                stack.push(number);
            } else {
                stack.pop();
            }
        }

        for (int i : stack) {
            sum += i;
        }

        System.out.println(sum);
    }
}
