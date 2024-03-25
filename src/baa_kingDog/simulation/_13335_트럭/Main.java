package baa_kingDog.simulation._13335_트럭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    private int solution(int n, int w, int L, int[] arr) {
        Queue<Integer> truck = new LinkedList<>();
        for (int weight : arr) {
            truck.offer(weight);
        }

        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < w; i++) {
            bridge.offer(0);
        }

        int time = 0, curWeight = 0;
        while (!bridge.isEmpty()) {
            time++;
            curWeight -= bridge.poll();
            if (!truck.isEmpty()) {
                if (truck.peek() + curWeight <= L) {
                    curWeight += truck.peek();
                    bridge.offer(truck.poll());
                } else {
                    bridge.offer(0);
                }
            }
        }

        return time;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] initData = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = initData[0];
        int w = initData[1];
        int L = initData[2];
        System.out.print(m.solution(n, w, L, arr));
    }

}