package baa_kingDog.queue._02_큐_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    private static StringBuilder result;
    private static Deque<Integer> queue;

    private void process(String order, int num) {
        switch (order) {
            case "push":
                queue.add(num);
                break;
            case "pop":
                if (!queue.isEmpty()) {
                    result.append(queue.removeFirst()).append("\n");
                } else {
                    result.append(-1).append("\n");
                }
                break;
            case "size":
                result.append(queue.size()).append("\n");
                break;
            case "empty":
                if (!queue.isEmpty()) {
                    result.append(0).append("\n");
                } else {
                    result.append(1).append("\n");
                }
                break;
            case "front":
                if (!queue.isEmpty()) {
                    result.append(queue.peekFirst()).append("\n");
                } else {
                    result.append(-1).append("\n");
                }
                break;
            case "back":
                if (!queue.isEmpty()) {
                    result.append(queue.peekLast()).append("\n");
                } else {
                    result.append(-1).append("\n");
                }
        }
    }

    private String solution(int n, String[] orders, int[] data) {
        queue = new LinkedList<>();
        result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            process(orders[i], data[i]);
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
            orders[i] = input[0];
            if (input[0].equals("push")) {
                data[i] = Integer.parseInt(input[1]);
            }
        }
        System.out.println(m.solution(n, orders, data));
    }

}
