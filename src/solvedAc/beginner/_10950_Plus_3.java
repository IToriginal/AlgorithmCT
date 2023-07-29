package solvedAc.beginner;

import java.io.*;

public class _10950_Plus_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int n = Integer.parseInt(input);

        for (int i = 0; i < n; i++) {
            String inputNumbers = br.readLine();
            String[] numbers = inputNumbers.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            System.out.println(a + b);
        }
    }
}
