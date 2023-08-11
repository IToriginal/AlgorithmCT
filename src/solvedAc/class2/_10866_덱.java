package solvedAc.class2;

import java.io.*;
import java.util.*;

public class _10866_덱 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            String order = input[0];

            switch (order) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(input[1]));
                    break;

                case "push_back":
                    deque.addLast(Integer.parseInt(input[1]));
                    break;

                case "pop_front":
                    if (deque.isEmpty()) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(deque.pollFirst()).append("\n");
                    }
                    break;

                case "pop_back":
                    if (deque.isEmpty()) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(deque.pollLast()).append("\n");
                    }
                    break;

                case "size":
                    result.append(deque.size()).append("\n");
                    break;

                case "empty":
                    if (deque.isEmpty()) {
                        result.append(1).append("\n");
                    } else {
                        result.append(0).append("\n");
                    }
                    break;

                case "front":
                    if (deque.isEmpty()) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(deque.peekFirst()).append("\n");
                    }
                    break;

                case "back":
                    if (deque.isEmpty()) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(deque.peekLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(result);
    }
}
