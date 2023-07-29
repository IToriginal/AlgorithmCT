package solvedAc.beginner;

import java.io.*;

public class _10952_Plus_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean loop = true;

        while (loop) {
            String input = br.readLine();
            String[] numbers = input.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            if (a == 0 && b == 0) {
                loop = false;
            } else {
                System.out.println(a + b);
            }
        }
    }
}
