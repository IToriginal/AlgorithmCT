package solvedAc.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2023. 07. 28 (금)
 * Try 1 - Fail (답안 확인)
 */
public class _11382_LittleJeongmin {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] numbers = input.split(" ");

        long a = Long.parseLong(numbers[0]);
        long b = Long.parseLong(numbers[1]);
        long c = Long.parseLong(numbers[2]);

        System.out.println(a + b + c);

    }
}
