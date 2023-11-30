package baekjoon.doit.그리디._034_수_묶기; // BOJ1744 - G4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    private static int n, oneCount, zeroCount;
    private static int[] arr;

    private void divideData(PriorityQueue<Integer> pqPlus, PriorityQueue<Integer> pqMinus) {
        for (int i = 0; i < n; i++) {
            if (arr[i] > 1) {
                pqPlus.add(arr[i]);
            } else if (arr[i] == 1) {
                oneCount++;
            } else if (arr[i] == 0) {
                zeroCount++;
            } else {
                pqMinus.add(arr[i]);
            }
        }
    }

    private int solution() {
        PriorityQueue<Integer> pqPlus = new PriorityQueue<>();
        PriorityQueue<Integer> pqMinus = new PriorityQueue<>();
        divideData(pqPlus, pqMinus);
        int sum = 0;

        while (pqPlus.size() > 1) {
            int dataA = pqPlus.remove();
            int dataB = pqPlus.remove();
            sum += dataA * dataB;
        }
        if (!pqPlus.isEmpty()) {
            sum += pqPlus.remove();
        }

        while (pqMinus.size() > 1) {
            int dataA = pqMinus.remove();
            int dataB = pqMinus.remove();
            sum += dataA * dataB;
        }
        if (!pqMinus.isEmpty()) {
            if (zeroCount == 0) {
                sum += pqMinus.remove();
            }
        }

        sum += oneCount;

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
