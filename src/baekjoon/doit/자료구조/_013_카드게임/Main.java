package baekjoon.doit.자료구조._013_카드게임; // BOJ2164 - S4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class Main {

    private int solution(int n, int[] cards) {
        Deque<Integer> queue = new LinkedList<>();
        Arrays.stream(cards).forEach(queue::offer);
        while (queue.size() > 1) {
            queue.poll();
            queue.offer(queue.poll());
        }
        return queue.getFirst();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] cards = IntStream.rangeClosed(1, n).toArray();
        System.out.print(T.solution(n, cards));
    }

}
