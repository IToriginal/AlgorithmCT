package baa_kingDog.deque._1021_회전하는_큐; // BOJ1021 - S3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    private int solution(int n, int m, int[] data) {
        int answer = 0;

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        // 회전 연산
        for (int i = 0; i < m; i++) {
            int target = data[i]; // 현재 회전 연산의 목표 값
            int count = 0; // 회전 횟수를 초기화

            while (target != deque.peek()) {
                deque.add(deque.poll());
                count++;
            }

            /**
             * 양방향으로 회전
             * 예: 덱의 크기가 10이고, 현재 위치가 4일 때,
             * 시계방향으로 7번 회전하면 1에 도달한다.
             * 반시계 방향으로 3번 회전하면 1에 도달한다.
             */
            answer += Math.min(count, deque.size() - count);
            deque.poll();
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main t = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);
        int[] data = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(t.solution(n, m, data));
    }
}
