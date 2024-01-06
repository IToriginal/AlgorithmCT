package baa_kingDog.deque._01_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    private Deque<Integer> deque;
    private StringBuilder result;

    public void process(String order, int num) {
        switch (order) {
            case "push_front":
                deque.addFirst(num);
                break;

            case "push_back":
                deque.addLast(num);
                break;

            case "pop_front":
                if (!deque.isEmpty()) {
                    result.append(deque.pollFirst()).append("\n");
                } else {
                    result.append(-1).append("\n");
                }
                break;

            case "pop_back":
                if (!deque.isEmpty()) {
                    result.append(deque.pollLast()).append("\n");
                } else {
                    result.append(-1).append("\n");
                }
                break;

            case "size":
                result.append(deque.size()).append("\n");
                break;

            case "empty":
                if (!deque.isEmpty()) {
                    result.append(0).append("\n");
                } else {
                    result.append(1).append("\n");
                }
                break;

            case "front":
                if (!deque.isEmpty()) {
                    result.append(deque.peekFirst()).append("\n");
                } else {
                    result.append(-1).append("\n");
                }
                break;

            case "back":
                if (!deque.isEmpty()) {
                    result.append(deque.peekLast()).append("\n");
                } else {
                    result.append(-1).append("\n");
                }
                break;
        }
    }

    public String solution(int n, String[] orders, int[] data) {
        deque = new LinkedList<>();
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
            if (input[0].equals("push_back") || input[0].equals("push_front")) {
                data[i] = Integer.parseInt(input[1]);
            }
        }

        System.out.println(m.solution(n, orders, data));


    }

}
