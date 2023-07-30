package solvedAc.beginner;

import java.io.*;
public class _15964_StrangeSign {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] numbers = input.split(" ");

        long a = Long.parseLong(numbers[0]);
        long b = Long.parseLong(numbers[1]);

        System.out.println((a + b) * (a - b));
    }
}
