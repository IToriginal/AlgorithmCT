package solvedAc.class2;

import java.io.*;

public class _10989_SortNumber3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        /**
         * 1차 시도: 시간 초과 발생
         */
        // int[] numbers = new int[testCase];
        //
        // for (int i = 0; i < testCase; i++) {
        //     numbers[i] = Integer.parseInt(br.readLine());
        // }
        //
        // Arrays.sort(numbers);
        //
        // for (int number : numbers) {
        //     System.out.println(number);
        // }

        /**
         * 2차 시도: 카운트 정렬 - 시간 초과 발생
         */
        int[] numbers = new int[10001]; // 문제 범위: 1 ~ 10000
        for (int i = 0; i < testCase; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[num]++;
        }

        for (int i = 1; i <= 10000; i++) {
            while (numbers[i] > 0) {
                result.append(i).append("\n");
                numbers[i]--;
            }
        }
        System.out.println(result);
    }
}
