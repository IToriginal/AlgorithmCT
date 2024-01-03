package baa_kingDog.queue._01_큐; // BOJ10845 - S4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    private static StringBuilder result = new StringBuilder();
    private static Deque<Integer> queue;

    private void process(String order, int num) {
        switch (order) {
            case "push": // 정수 X를 큐에 넣는 연산
                queue.add(num);
                break;
            case "pop":
                if (!queue.isEmpty()) { // 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력
                    result.append(queue.peekFirst()).append("\n");
                    queue.removeFirst();
                } else { // 큐에 있는 정수가 없는 경우 -1 출력
                    result.append(-1).append("\n");
                }
                break;
            case "size": // 큐에 있는 정수의 개수를 출력한다.
                result.append(queue.size()).append("\n");
                break;
            case "empty":
                if (!queue.isEmpty()) { // 큐에 값이 있으면 0
                    result.append(0).append("\n");
                } else { // 큐가 비어 있으면 1
                    result.append(1).append("\n");
                }
                break;
            case "front":
                if (!queue.isEmpty()) { // 큐의 가장 앞에 있는 정수를 출력
                    result.append(queue.peekFirst()).append("\n");
                } else { // 큐에 정수가 없는 경우에는 -1을 출력
                    result.append(-1).append("\n");
                }
                break;
            case "back":
                if (!queue.isEmpty()) { // 큐의 가장 뒤에 있는 정수를 출력
                    result.append(queue.peekLast()).append("\n");
                } else { // 큐에 정수가 없는 경우 -1 출력
                    result.append(-1).append("\n");
                }
                break;
        }
    }

    public String solution(int n, String[] orders, int[] nums) {
        queue = new LinkedList<>();
        result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String order = orders[i];
            int num = nums[i];
            process(order, num);
        }
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] orders = new String[n];
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            orders[i] = input[0];
            if (input[0].equals("push")) {
                nums[i] = Integer.parseInt(input[1]);
            }
        }
        System.out.println(m.solution(n, orders, nums));
    }

}
