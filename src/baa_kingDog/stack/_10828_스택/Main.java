package baa_kingDog.stack._10828_스택;

import java.io.*;
import java.util.*;

public class Main {

    private Stack<Integer> stack;
    private StringBuilder result;

    private void process(String order, int index, int[] data) {
        switch (order) {
            // push X: 정수 X를 스택에 넣는 연산이다.
            case "push":
                stack.add(data[index]);
                break;
            // pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            case "pop":
                if (stack.isEmpty()) {
                    result.append("-1").append("\n");
                } else {
                    result.append(stack.pop()).append("\n");
                }
                break;
            // size: 스택에 들어있는 정수의 개수를 출력한다.
            case "size":
                result.append(stack.size()).append("\n");
                break;
            // empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
            case "empty":
                if (stack.isEmpty()) {
                    result.append("1").append("\n");
                } else {
                    result.append("0").append("\n");
                }
                break;
            // top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            case "top":
                if (stack.isEmpty()) {
                    result.append("-1").append("\n");
                } else {
                    result.append(stack.peek()).append("\n");
                }
                break;
        }
    }

    private String solution(int n, String[] orders, int[] data) {
        result = new StringBuilder();
        stack = new Stack<>();

        for (int index = 0; index < n; index++) {
            process(orders[index], index, data);
        }

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] orders = new String[n];
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            if (input[0].equals("push")) {
                orders[i] = input[0];
                data[i] = Integer.parseInt(input[1]);
            } else {
                orders[i] = input[0];
            }
        }

        System.out.println(m.solution(n, orders, data));
    }

}
