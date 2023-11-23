package baekjoon.doit.정렬._016_버블_소트_프로그램_1; // BOJ1377 - G2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    class Data implements Comparable<Data> {

        int value;
        int index;

        public Data(int value, int index) {
            super();
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Data data) {
            return Integer.compare(this.value, data.value);
        }

    }

    public int solution(int n, int[] numbers) {
        Data[] data = new Data[n];
        for (int i = 0; i < n; i++) {
            data[i] = new Data(numbers[i], i);
        }
        Arrays.sort(data);
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < data[i].index - i) {
                max = data[i].index - i;
            };
        }
        return max + 1;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = br.lines().limit(n)
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(T.solution(n, numbers));
    }

}
