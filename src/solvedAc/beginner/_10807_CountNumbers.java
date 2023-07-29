package solvedAc.beginner;

import java.io.*;

public class _10807_CountNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine1 = br.readLine();
        int n = Integer.parseInt(inputLine1);

        String inputLine2 = br.readLine();
        String[] numbers = inputLine2.split(" ");
        int[] intNumbers = new int[n];

        for (int i = 0; i < n; i++) { // 수정: n 대신 numbers.length 사용
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }

        String inputLine3 = br.readLine();
        int v = Integer.parseInt(inputLine3);
        int count = 0;

        for (int num : intNumbers) {
            if (num == v) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}
