package solvedAc.beginner;

import java.io.*;

public class _10871_LessThan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

        String[] numbers = br.readLine().split(" ");
        int[] intNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }

        for (int number : intNumbers) {
            if (number < x) {
                bw.write(number + " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
