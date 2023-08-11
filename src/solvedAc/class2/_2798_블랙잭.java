package solvedAc.class2;

import java.io.*;

public class _2798_블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String[] gameInput = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); // card의 개수
        int m = Integer.parseInt(input[1]); // 기준 점수

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(gameInput[i]);
        }

        int result = search(numbers, n, m);
        System.out.println(result);
    }

    public static int search(int[] numbers, int n, int m) {
        int result = 0;

        for (int i = 0; i < n - 2; i++) { // 3EA. 1번 카드는 n-2 까지 순회
            for (int j = i + 1; j < n - 1; j++) { // 2번 카드. 1번 카드 다음 부터 n-1 까지 순회
                for (int k = j + 1; k < n; k++) { // 3번 카드. 2번 카드 다음 부터 n 까지 순회
                    int numSum = numbers[i] + numbers[j] + numbers[k]; // 3EA 카드의 합

                    if (numSum == m) { // m 과 3EA 카드의 합이 같다면?
                        return numSum; // 리턴 numSum 및 종료
                    }

                    if (numSum > result && numSum < m) {
                        result = numSum;
                    }
                }
            }
        }
        return result;
    }
}
