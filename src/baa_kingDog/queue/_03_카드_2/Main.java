package baa_kingDog.queue._03_카드_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    private int solution(int n) {
        Deque<Integer> queue = new LinkedList<>();
        for (int card = 1; card <= n; card++) {
            queue.add(card);
        }

        while (queue.size() != 1) {
            queue.removeFirst();
            queue.add(queue.peekFirst());
            queue.removeFirst();
        }

        return queue.peekFirst();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(m.solution(n));
    }

}
