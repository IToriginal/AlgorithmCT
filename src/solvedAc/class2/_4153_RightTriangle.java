package solvedAc.class2;

import java.io.*;
import java.util.*;

public class _4153_RightTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while (true) {
            String[] input = br.readLine().split(" ");
            int[] numbers = new int[input.length];

            for (int i = 0; i < input.length; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }

            Arrays.sort(numbers);

            if (numbers[0] == 0 && numbers[1] == 0 && numbers[2] == 0) {
                break;
            }

            int calc = (numbers[0] * numbers[0]) + (numbers[1] * numbers[1]);

            if ((numbers[2] * numbers[2]) == calc) {
                result.append("right").append("\n");
            } else {
                result.append("wrong").append("\n");
            }
        }
        System.out.println(result);
    }
}
