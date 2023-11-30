package baekjoon.doit.그리디._033_카드_정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    private static int n;
    private static int[] arr;

    private int solution() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }

        int sum = 0;
        while (pq.size() != 1) {
            int data1 = pq.remove();
            int data2 = pq.remove();
            sum += data1 + data2;
            pq.add(data1 + data2);
        }
        return sum;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
