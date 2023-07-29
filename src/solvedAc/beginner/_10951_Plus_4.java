package solvedAc.beginner;

import java.io.*;

public class _10951_Plus_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();

            if (input == null || input.trim().isEmpty()) {
                break;
            } else {
                String[] numbers = input.split(" ");

                int a = Integer.parseInt(numbers[0]);
                int b = Integer.parseInt(numbers[1]);

                System.out.println(a + b);
            }
        }
    }
}
