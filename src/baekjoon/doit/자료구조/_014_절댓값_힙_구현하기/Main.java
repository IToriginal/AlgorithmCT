package baekjoon.doit.자료구조._014_절댓값_힙_구현하기; // BOJ11286 - S1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    public List<Integer> solution(int n, int[] arr) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if (first == second) {
                return Integer.compare(o1, o2);
            } else {
                return Integer.compare(first, second);
            }
        });

        for (int number : arr) {
            if (number == 0) {
                if (queue.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(queue.poll());
                }
            } else {
                queue.offer(number);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        List<Integer> result = T.solution(n, arr);
        result.forEach(System.out::println);
    }

}
