package solvedAc.class2;

import java.io.*;
import java.util.*;

public class _10828_Stack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String[] input = br.readLine().split(" ");
            String order = input[0];

            switch (order) {
                case "push":
                    stack.push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    if (!stack.isEmpty()) {
                        result.append(stack.pop()).append("\n");
                    } else {
                        result.append(-1).append("\n");
                    }
                    break;
                case "size":
                    result.append(stack.size()).append("\n");
                    break;
                case  "empty":
                    if (!stack.isEmpty()) {
                        result.append(0).append("\n");
                    } else {
                        result.append(1).append("\n");
                    }
                    break;
                case "top":
                    if (!stack.isEmpty()) {
                        result.append(stack.peek()).append("\n");
                    } else {
                        result.append(-1).append("\n");
                    }
                    break;
            }
        }
        System.out.println(result);
    }
}
