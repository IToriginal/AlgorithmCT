package inflearn.기본._05_Stack_Queue._06_공주구하기;

import java.io.*;
import java.util.*;

public class MyAnswer {
    public int solution(int n, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        int cnt = 0;
        while (deque.size() != 1) {
            cnt++;
            if (cnt == 3) {
                deque.pollFirst();
                cnt = 0;
            } else {
                int player = deque.pollFirst();
                deque.add(player);
            }
        }

        return deque.getFirst();
    }

    public static void main(String[] args) throws IOException {
        MyAnswer T = new MyAnswer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        System.out.println(T.solution(n, k));
    }
}
