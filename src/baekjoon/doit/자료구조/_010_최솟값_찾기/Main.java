package baekjoon.doit.자료구조._010_최솟값_찾기; // BOJ11003 - P5

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// TODO: 슬라이딩 윈도우 핵심 유형
public class Main {

    static class Node {

        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

    }

    private int[] solution(int n, int l, int[] numbers) {
        int[] result = new int[n];
        Deque<Node> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int number = numbers[i];

            while (!deque.isEmpty() && deque.getLast().value > number) {
                deque.removeLast();
            }
            deque.addLast(new Node(number, i));

            if (deque.getFirst().index <= i - l) {
                deque.removeFirst();
            }

            result[i] = deque.getFirst().value;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]); // N개의 수
        int L = Integer.parseInt(firstLine[1]); // L = 1번의 슬라이딩 윈도우 인덱스 수
        int[] numbers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int number : T.solution(N, L, numbers)) {
            System.out.print(number + " ");
        }
    }

}
